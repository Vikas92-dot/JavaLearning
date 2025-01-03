import java.util.Scanner;

public class CountVC {
    public static boolean isVowel(char c){
        boolean flag = false;
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            flag = true;
        }
        return flag;
    }
    public static boolean isConsonant(char c){
        boolean flag = false;
        if ((c >='a' && c <='z') && (c != 'a' || c != 'e' || c != 'i' || c != 'o' || c != 'u')) {
                flag = true;
            }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = sc.nextLine();
        String str1 = str.toLowerCase();
        char ch[] = str1.toCharArray();
        
        int countVo=0,countCo=0;
        for(int i=0; i<ch.length; i++){
            if (isVowel(ch[i])) {
                countVo++;
            }
            else if (isConsonant(ch[i])) {
                countCo++;
            }
            
        }
        System.out.println("Number of Vowels: "+countVo+"\nNumber of Consonants: "+countCo);
    }
}
