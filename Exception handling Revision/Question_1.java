import java.util.Scanner;
public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a single line of input separated by a space. Obtain the integers N1 and N2.");
        String s[] = sc.nextLine().split(" ");
        int N1 = Integer.parseInt(s[0]);
        int N2 = Integer.parseInt(s[1]);
        
        try {
            System.out.println(N1/N2);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        sc.close();
    }
}
