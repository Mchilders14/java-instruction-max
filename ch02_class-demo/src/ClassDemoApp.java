
public class ClassDemoApp {

	public static void main(String[] args) {
		msg("Hello! Welcome to the application");

		// Single line comment

		/*
		 * This is a block comment
		 */

		msg("Bye");

		int counter = 1;
		double unitPrice = 14.99;

		System.out.println(counter);
		System.out.println(unitPrice);

		// Casting
		int a = 5;
		double b = 8.3;
		// int sum2 = a+b; -> invalid
		int sum2 = (int) (a + b);
		
		
		counter = 1;
		//Several ways to increment.
		counter = counter + 1;
		counter += 1;
		counter++;
		System.out.println("Counter = " + counter);
		
		String fName = "Matthew";
		String mName = "Jacob";
		String lName = "Childers";

	}

	public static void msg(String string) {
		System.out.println(string);
	}
}
