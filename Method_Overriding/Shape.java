

public class Shape {
		public void calculateArea() {
			System.out.println("Area calculation not defined for Shape.");
		}
}
class Circle extends Shape{
		private double radius;
		
		public Circle(double radius) {
			super();
			this.radius = radius;
		}

		public void calculateArea() {
			System.out.println("Area of circle: "+2*3.14*radius);
		}
		
}
class Rectangle extends Shape{
	private int l;
	private int b;
	
	
	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}


	public void calculateArea() {
		System.out.println("Area of Rectangle: "+(l*b));
	}
	
}