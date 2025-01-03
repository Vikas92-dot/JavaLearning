import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = sc.next();
        char ch[] = str.toCharArray();
        int i=0, j=ch.length-1;
        boolean flag = false;

        while (i <= j) {
            if (ch[i] == ch[j]) {
                flag = true;
            }
            i++;
            j--;
        }
    if (flag) {
        System.out.println("Yes, it's a palindrome.");
    }
    else{
        System.out.println("No, it's not a Palindrome.");
    }
    }
}
