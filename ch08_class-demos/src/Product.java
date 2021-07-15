

public class Product {
	
	private String code;
	private String description;
	private double price;
	
	public Product() {
		// By default java sets primitive number types to 0 and strings to null.
	}

	public Product(String code, String description, double price) {
		super(); // Inherits from java.lang.object
		this.code = code;
		this.description = description;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return description;
	}

	@Override
	public boolean equals(Object obj) {
		boolean sameData = false;
		if (obj instanceof Product) {
			Product p = (Product)obj;
			if(p.getCode().equals(code));
			sameData = true;
		}
		return super.equals(obj);
	}
	
	
	
	

}
