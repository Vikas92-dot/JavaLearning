package Abstract_class;

public abstract class LibraryItem {
		private String title;
		private String author;
		
		public LibraryItem(String title, String author) {
			this.title = title;
			this.author = author;
		}
		
		
		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getAuthor() {
			return author;
		}


		public void setAuthor(String author) {
			this.author = author;
		}


		abstract void checkout();
		abstract void returnItem();
		
		void displayInfo() {
			System.out.println("Title: "+title+" Author: "+author);
		}
		
		
}
