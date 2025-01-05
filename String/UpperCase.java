import java.util.Scanner;

public class UpperCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = sc.nextLine();
        
        String strA[] = str.split(" ");

        for(int i=0; i<strA.length; i++){
            
            strA[i] = Character.toUpperCase(strA[i].charAt(0)) + strA[i].substring(1);
            
        }
        String res = String.join(" ",strA);
        System.out.println("Output: "+res);
    }
}
