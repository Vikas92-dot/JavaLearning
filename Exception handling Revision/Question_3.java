import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The input consists of a integer value.");
        
        try {
            int num = sc.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
    }
}
