
public class ShapeMain {
	public static void main(String args[]) {
		Shape arr[] = new Shape[2];
		arr[0] = new Circle(14);
		arr[1] = new Rectangle(12,15);
		
		arr[0].calculateArea();
		arr[1].calculateArea();
	}
}
