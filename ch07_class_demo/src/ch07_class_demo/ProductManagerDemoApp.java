package ch07_class_demo;

public class ProductManagerDemoApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Product Manager App");

		Product p1 = new Product();

		p1.setCode("java");
		p1.setDescription("Murach's Java Programming");
		p1.setPrice(57.5);

		Product p2 = new Product("andr", "Murach's Android Programming", 59.50);
		Product p3 = new Product("andr", "Murach's Android Programming", 59.50);
		
		Product p4 = p1;

		printProduct(p1);
		printProduct(p2);
		printProduct(p3);
		printProduct(p4);
		
		if (p2 == p3) {
			System.out.println("Same!");
		}

		System.out.println("Goodbye to the Product Manager App");
	}

	private static void printProduct(Product p) {
		System.out.println("Code: " + p.getCode());
		System.out.println("Description: " + p.getDescription());
		System.out.println("Price: " + p.getPrice());
	}

}
