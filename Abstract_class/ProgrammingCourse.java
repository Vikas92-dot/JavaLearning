package Abstract_class;

public class ProgrammingCourse extends Course {
		private String language;
		
		
		public ProgrammingCourse(String courseName, int duration, String language) {
			super(courseName, duration);
			this.language = language;
		}


		void showContent() {
			System.out.println("This course covers programming in "+language);
		}
		
}
