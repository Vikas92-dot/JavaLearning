import java.util.Scanner;
import java.util.Arrays;
public class ConvertVowels {
    public static boolean isVowel(char c){
        boolean flag = false;
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            flag = true;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = sc.nextLine();
        
        char ch[] = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            
            if (isVowel(ch[i])) {
                ch[i] = (char)(ch[i]-32) ;
            }
        }
        String result = new String(ch);
        System.out.println("Output: "+result);
    }
}
