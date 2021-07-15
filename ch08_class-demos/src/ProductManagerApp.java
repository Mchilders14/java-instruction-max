
public class ProductManagerApp {
	public static void main(String[] args) {
		
		System.out.println("Welcome to the product manager App");
		
		Book b = new Book("java", "Murach's Java Programming", 57.50, "Joel Murach");
		Software s = new Software("netbeans", "netbeans", 0, "8.2");
		
		System.out.println(b);
		System.out.println(s);
		
		Product p = b;
		
		System.out.println(p.toString());
		
		Product p1 = new Product("Android", "Murach's Android", 57.99);
		Product p2 = new Product("Android", "Murach's Android", 57.99);
		
		if (p1.equals(p2)) {
			System.out.println("Same book.");
		} else {
			System.out.println("Differnt Book.");
		}
		
		Book b2 = (Book) p;
		
		//Product p3 = new Product();		<- Doesnt work
		//Book b3 = (Book) p3;				<- Doesnt Work


	}

}
