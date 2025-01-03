import java.util.Scanner;

public class SpecialCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        boolean flag = false;
        for(int i=0; i<ch.length; i++){
            if (ch[i] == '$' || ch[i] == '@' || ch[i] == '#') {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Special character is available.");
        }
        else{
            System.out.println("Special character is not available");
        }
    }
}
