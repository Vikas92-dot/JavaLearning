package Inheritance;

public class B extends A{
    static{
        System.out.println("B-Block");
    }
    {
        System.out.println("B-Init");
    }
    public B(){
        System.out.println("B-default");
    }
    public static void main(String[] args) {
        B obj3 = new B();
    }
}
