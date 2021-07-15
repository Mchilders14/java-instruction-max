
public class CalculatorApp {

	public static void main(String[] args) {

		msg("Hello this is the start of the program!");
		
		int n1 = 5;
		int n2 = 7;
		int sum = n1 + n2;
		
		System.out.println("Sum = "+sum);
		
		int difference = n1 - n2;
		System.out.println("Differnce = "+difference);

		int product = n1 * n2;
		System.out.println("Product = "+product);
		
		int quotient = n2 / n1;
		System.out.println("Differnce = "+quotient);
		
		int modulus = n2%n1;
		System.out.println("Modulus = "+modulus);
		
		


		msg("This is the end of the program!");
	}
	
	
	
	
	

	public static void msg(String string) {
		System.out.println(string);
	}
}
