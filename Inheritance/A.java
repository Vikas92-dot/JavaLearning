package Inheritance;

public class A {
    static{
        System.out.println("A-Block");
    }
    {
        System.out.println("A Init");
    }
    public A(){
        System.out.println("A default");
    }
}
