package Abstract_class;

public class LibraryMain {
	public static void main(String args[]) {
		LibraryItem objItem = new Book("Rich dad poor dad","Robert",300);
		LibraryItem objItem2 = new DVD("Atomic habits","xyz",120);
		
		objItem.checkout();
		objItem.returnItem();
		objItem.displayInfo();
		
		System.out.println();
		
		objItem2.checkout();
		objItem2.returnItem();
		objItem2.displayInfo();
	}
}
