class A {
    int a=900;
    void sum(){
        System.out.println("A class sum");
    }
}
public class B extends A{
    int b=500;
    void sum(){
        System.out.println("B class sum");
    }
    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj.a);
    }
}
