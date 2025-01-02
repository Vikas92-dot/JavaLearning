abstract class A{
    void m1(){
        System.out.println("This is a normal method");
    }
}
class B extends A{

}

public class Demo5 {
    public static void main(String[] args) {
        A obj = new B();
        obj.m1();
    }
}