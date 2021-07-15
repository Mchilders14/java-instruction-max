
public class Album extends Product{
	
	private String artist;

	public Album(String code, String description, double price, String Artist) {
		super(code, description, price);
	}

	public Album() {
		super();
		count++;
	}

	@Override
	public String toString() {
		return super.toString() + " Artist: " + artist;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

}
