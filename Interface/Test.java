interface A {
    int x=10;
    int y=45;

    void display();
}
class B implements A{
    public void display(){
        System.out.println("Hii...");
    }
}
public class Test{
    public static void main(String[] args) {
        A obj = new B();
        obj.display();
        System.out.println(obj.x);
    }
}
