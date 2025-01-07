import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer value");
        int n = sc.nextInt();
        try{
            try{
                if (n == 0) {
                    throw new ArithmeticException();
                }
            }
            catch(ArithmeticException a){
                System.out.println("ArithmeticException caught - / by zero");
            }
            
            try{
                if (n > 7) {
                    throw new IllegalArgumentException();
                }
            }
            catch(IllegalArgumentException i){
                System.out.println("IllegalArgumentException caught - Number should not be greater than 7");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        if (n != 0 && n < 7) {
            
            System.out.println(n);
        }
        
    }
}
