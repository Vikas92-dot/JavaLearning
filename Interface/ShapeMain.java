import java.util.Scanner;

interface Shape {
     void calculateArea();
    
}
class Rectangle implements Shape{
    double l;
    double b;
    
    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public void calculateArea(){
        double area = l*b;
        System.out.printf("Area of Rectangle: %.2f",area);
    }
}
class Circle implements Shape{
    double r;
    
    public Circle(double r) {
        this.r = r;
    }

    public void calculateArea(){
        double area = 2*3.14*r;
        System.out.printf("Area of Circle: %.2f",area);
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle..");
        double r = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the length and breadth of Rectangle.");
        double l = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());

        Shape obj = new Circle(r);
        obj.calculateArea();
        Shape obj1 = new Rectangle(l,b);
        obj1.calculateArea();

    }
}
