import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;

public class PrimitivesApp {

	public static void main(String[] args) {
		// Learning ASCII characters.

		char a1 = 'A';
		char a2 = 'a';
		char a3 = 65;
		char a4 = 97;
		char copyright = 169;

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(copyright);

		// implicit casting p.96
		double grade = 93;
		double d = 95.0;
		int i = 86, j = 91;
		double average = (d + i + j) / 3;

		System.out.println("Avg = " + average);

		// explicit cast
		int grade2 = (int) 93.75;
		System.out.println("Grade = " + grade2);
		int average2 = ((int) d + i + j) / 3;
		int remainder = ((int) d + i + j) % 3;

		System.out.println("Average 2 = " + average2 + ", Remainder = " + remainder);

		// Math Class p.103
		// Round method
		double percent = Math.round(0.325);
		System.out.println("Percent = " + percent);
		// Round to thousandths place (3 decimals)
		percent = (double) Math.round(.0325 * 1000) / 1000;
		System.out.println("Percent = " + percent);

		// POW
		System.out.println(Math.pow(2, 3));

		// SQRT
		System.out.println(Math.sqrt(25));

		// Min/Max
		System.out.println(Math.min(11.7, 23.4));
		System.out.println(Math.max(11.7, 23.4));

		// Random
		System.out.println(Math.random());

		// Die roll (1-6)
		int die = (int) (Math.random() * 6) + 1;
		System.out.println("Die = " + die);

		// Die roll (1-6)
		int rand = (int) (Math.random() * 100) + 1;
		System.out.println("rand = " + rand);
		
		//Number Format p.105
		double price = 11.575;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println("Formatted Price: " + currency.format(price));
		
		double majority = 0.505;
		NumberFormat pct = NumberFormat.getPercentInstance();
		System.out.println(pct.format(majority));
		
		double miles = 15341.253;
		NumberFormat number =  NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(1);
		System.out.println(number.format(miles));
		
		//Big Decimal p.113
		BigDecimal subtotal = new BigDecimal("100.05");
		BigDecimal discountPct = new BigDecimal(".1");
		
		//Declaring Constant for BigDecimal numbers
		final BigDecimal Sales_TAX_PCT = new BigDecimal(".05");
		BigDecimal discountAmt = subtotal.multiply(discountPct);
		discountAmt = discountAmt.setScale(2, RoundingMode.HALF_UP);
		
		BigDecimal totalBeforeTax = subtotal.subtract(discountAmt);
		BigDecimal salesTax = totalBeforeTax.multiply(Sales_TAX_PCT);
		BigDecimal total = totalBeforeTax.add(salesTax);
		
		System.out.println("Subtotal: \t" + currency.format(subtotal));
		System.out.println("Discount Pct: \t" + currency.format(discountPct));
		System.out.println("Sales Tax Pct: \t" + currency.format(discountAmt));
		System.out.println("Subtotal: \t" + currency.format(totalBeforeTax));
		System.out.println("Subtotal: \t" + currency.format(salesTax));
		System.out.println("Subtotal: \t" + currency.format(total));
		
		

	}

}
