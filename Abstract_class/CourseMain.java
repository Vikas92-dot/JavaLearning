package Abstract_class;

public class CourseMain {
		public static void main(String arg[]) {
			Course obj = new ProgrammingCourse("MERN stack",5,"Node js");
			Course obj1 = new DesignCourse("Animation",8,"abc");
			
			obj.showContent();
			obj.displayDetails();
			
			obj1.showContent();
			obj1.displayDetails();
		}
}
