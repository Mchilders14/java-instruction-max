import java.text.NumberFormat;

public class LineItem {

    private Product product;
    private int quantity;

    public LineItem() {
        this.product = new Product();
        this.quantity = 0;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        double total = quantity * product.getPrice();
        return total;
    }
    
    public String getTotalFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getTotal());
    }
    
    @Override										// <-- Annotation Override of super method
	public boolean equals(Object obj) {				// <-- Overriding super method equals() with pulic accessor, including parameter Object
		if (obj instanceof LineItem) {				// <-- Boolean test whether the object is an instance of the specified type (LineItem)
			LineItem li = (LineItem) obj;			// <-- Assigning LineItem li value of (casting parameter [obj] as LineItem)
			if (product.equals(li.getProduct()) &&	// <-- Boolean test with method equals() of instance variables [product] && [quantity]
				quantity == li.getQuantity())		// <-- in Object(obj) LineItem(s)
				{
					return true;					// <-- Return true if above expresstion results in true
				}
		}
		return false;								// <-- If any above expressions result in false, return false
	}
}