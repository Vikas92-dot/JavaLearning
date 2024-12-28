package Abstract_class;

public class DesignCourse extends Course{
		private String tool;

		public DesignCourse(String courseName, int duration, String tool) {
			super(courseName, duration);
			this.tool = tool;
		}
		
		void showContent() {
			System.out.println("This course focuses on design using "+tool);
		}
}
