interface I1{
    private void m1(){
        System.out.println("Private method");
    }
    default void m2(){
        m1();
    }
}

public class Demo1 implements I1 {
    public static void main(String[] args) {
        
        I1 objI1 = new Demo11();
        objI1.m2();
    }
}
