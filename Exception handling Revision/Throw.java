class Invalid extends RuntimeException{
    Invalid(String msg){
        super(msg);
    }
}
//If we make Invalid as child of Exception then we need handle exception at where it occured
class B{
    int age;
    B(int age){
        this.age = age;
    }
    void test1() 
    {
        test2();
    }
    void test2() 
    {
        test3();
    }
    void test3() 
    {
        if (age < 0) {
            throw new Invalid("Age is not less than zero.");
        }
    }
}



public class Throw {
    public static void main(String[] args) {
        System.out.println("main start..");
        int age = Integer.parseInt(args[0]);
        
        
        try {
            B obj = new B(age);
            obj.test1();
        } catch (Invalid e) {
            System.out.println("Problem ");
        }
             
        System.out.println("Necessary code.");
        
    }
}
