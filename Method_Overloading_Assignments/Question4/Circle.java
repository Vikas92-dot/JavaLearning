import java.util.Scanner;

public class Circle {
     private int m;
    double n;

    public Circle(int m, double n) {
        this.m = m;
        this.n = n;
    }
    
    public void calculateCircumference(){
        double ans = 2*3.14*m;
        double ans1 = 2*3.14*n;
      
        System.out.printf("%.2f %.2f%n", ans, ans1);     
    }
    public void calculateArea(){
        double ans = 3.14*m*m;
        double ans1 = 3.14*n*n;
      
        System.out.printf("%.2f %.2f%n", ans, ans1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius in Integer:");
        int m = sc.nextInt();
        System.out.print("Enter the radius in Double:");
        double n = sc.nextDouble();
        
        
        Circle obj = new Circle(m,n);
        obj.calculateCircumference();
        obj.calculateArea();
    }
    
}
