class A{
    static{
        System.out.println("A static");
    }
    {
        System.out.println("A instance");
    }
    A(){
        System.out.println("A default con");
    }
    A(int a){
        System.out.println("A para");
    }
}
class B extends A{
    static{
        System.out.println("B static");
    }
    {
        System.out.println("B instance");
    }
    B(){
        System.out.println("B default con");
    }
    B(int a){
        System.out.println("B para");
    }
}
class C extends B{
    static{
        System.out.println("C static");
    }
    {
        System.out.println("C instance");
    }
    C(){
        System.out.println("C default con");
    }
    C(int a){
        System.out.println("C para");
    }
}



public class TestMain {
    public static void main(String[] args) {
        // A obj = new C();
        // A objA = new C(10);
        A obj =new A();
        A objA =new A(56);
        B obj1 = new B();
        B objB = new B(5);
        C obj2 = new C();
        C objC = new C(15);
    }
}
