import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            //double miles = sc.nextDouble();
            BigDecimal miles = sc.nextBigDecimal();									// <- Using BigDecimal
            
            System.out.print("Enter gallons of gas used: ");
            //double gallons = sc.nextDouble();
            BigDecimal gallons = sc.nextBigDecimal();								// <- Using BigDecimal

            
            //Using number format for three decimal places.
    		NumberFormat number =  NumberFormat.getNumberInstance();				// <- Using NumberFormat Class
    		number.setMaximumFractionDigits(2);										// <- 2 Digits Rounding
    		//number.setMaximumFractionDigits(3); 									// <- 3 Digits Rounding

            //double mpg = (double) Math.round((miles/gallons)*100)/100;
            //double mpg = (miles/gallons);
    		BigDecimal mpg;															// <- Using BigDecimal
    		mpg = miles.divide(gallons, 2, RoundingMode.HALF_UP );					// <- Using BigDecimal

            
            System.out.println("Miles per gallon is " + number.format(mpg) + ".");	// <- Using NumberFormat Class
            System.out.println(); 
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
            sc.close();
        }
    }
    
}
