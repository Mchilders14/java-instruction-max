import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
    
    @Override								// <-- Annotation Override of super method
	public boolean equals(Object obj) {		// <-- Overriding super method equals() with pulic accessor, including parameter Object
		if (obj instanceof Product) {		// <-- Boolean test whether the object is an instance of the specified type (Product)
			Product p = (Product)obj;		// <-- Assigning LineItem li value of (casting parameter [obj] as Product)
			if(p.getCode().equals(code));	// <-- Boolean expression, Object of class Product comparrison of instance variable [code]
			return true;					// <-- Return true if above expresstion results in true
		}
		return false;						// <-- If any above expressions result in false, return false
	}
}
