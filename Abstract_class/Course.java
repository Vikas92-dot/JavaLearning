package Abstract_class;

public abstract class Course {
		private String courseName;
		private int duration;
		
		public Course(String courseName, int duration) {
			this.courseName = courseName;
			this.duration = duration;
		}
		abstract void showContent();
		
		void displayDetails() {
			System.out.println("course name: "+courseName+" duration(in weeks): "+duration);
		}
		
		
}
