//we can create static methods in interface in java 9 ,
//also create main method because main method is also static and we can make object also

public interface Interface_8 {
    public static void main(String[] args) {
        System.out.println("Hi...");
        Shape obj = new Circle(14);
        Shape obj1 = new Rectangle(15,12.2);
        obj.calculateArea();
        obj1.calculateArea();
    }
    
} 
