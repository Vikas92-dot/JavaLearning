package Abstract_class;

public class DVD extends LibraryItem {
	private int duration;

	public DVD(String title, String author, int duration) {
		super(title, author);
		this.duration = duration;
	}

	void checkout() {
		System.out.println("Checking out book: "+getTitle());
	}
	void returnItem() {
		System.out.println("Returning book: "+getTitle());
	}
	
	
}
