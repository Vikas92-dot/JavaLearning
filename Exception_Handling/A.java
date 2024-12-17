package Exception_Handling;
import java.io.IOException;
public class A {
    public static void main(String[] args) {
        String s = null;
        System.out.println("Welcome");
        try{
            try {
                System.out.println(s.length());
            } catch (ArithmeticException e) {
                System.out.println(e);
            }

        }
        catch(Exception b){
            System.out.println(b);
            try {
                int a = 5/0;
                System.out.println(a);
            } catch (ArithmeticException a) {
                System.out.println(a);
            }
        }

        System.out.println("Bye..");
        
    }
}
