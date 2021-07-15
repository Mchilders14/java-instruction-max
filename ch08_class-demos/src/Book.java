
public class Book extends Product {
	private String author;

	public Book() {
		super();
		author = "";
	}
	

	public Book(String code, String description, double price, String author) {
		super(code, description, price); //Passing values into the super class.
		this.author = author;
	}



	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		return super.toString() + " By: " + author;
	}
	
	
	
}
