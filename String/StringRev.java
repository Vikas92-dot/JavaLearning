import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = sc.nextLine();
        String str1 = str.toLowerCase();
        char ch[] = str1.toCharArray();

        String newStr = "";

        for(int i=ch.length-1; i>=0; i--){
            if (ch[i] != ' ') {
                
                newStr += ch[i]; 
            }
        }
        System.out.println("Reverse String: "+newStr);
    }
}
