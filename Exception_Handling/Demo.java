package Exception_Handling;
import java.io.*;
public class Demo {
    public static void main(String[] args) {
        try{
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
            
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
            System.exit(1);               //it return and finally block will not execute.
        }
        finally{
            System.out.println("Good Bye...4564");
        }
    }
}
