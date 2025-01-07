import java.io.*;
class A{
    int test1(){
        try{
            String str = null;
            int x=str.length();
            return 90;
        }
        catch(NullPointerException ee){
            System.out.println(ee);
            return 700;
        }
        catch(Exception e){
            return 600; 
        }
        finally{
            System.out.println("Finally block"); 
            //return 60; //It overrides the catch return value
        }
        
    }  
}

public class Second {
    public static void main(String[] args) {
        System.out.println("main start");

        A obj = new A();
        System.out.println(obj.test1());
        System.out.println("Necessary code");
    }
}
