
public class Software extends Product {
	private String version;

	public Software(String version) {
		super();
		this.version = version;
	}

	public Software(String code, String description, double price, String version) {
		super(code, description, price);
	}

	@Override
	public String toString() {
		return super.toString() + " " + version;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	
	
	
	
	
	
	
}
