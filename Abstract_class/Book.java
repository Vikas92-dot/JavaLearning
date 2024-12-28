package Abstract_class;

public class Book extends LibraryItem {
		private int pages;

		public Book(String title, String author, int pages) {
			super(title, author);
			this.pages = pages;
		}
		@Override
		void checkout(){
			System.out.println("Checking out book: "+getTitle());
		}
		@Override
		void returnItem(){
			System.out.println("Returning book: "+getTitle());
		}
}
