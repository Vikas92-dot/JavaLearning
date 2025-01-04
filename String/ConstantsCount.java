import java.util.Scanner;

public class ConstantsCount {

    public static boolean isConsonant(char c){
        boolean flag = false;
        if ((c >='a' && c <='z') && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
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
        
        int countCo=0;
        for(int i=0; i<ch.length; i++){
            if (isConsonant(ch[i])) {
                countCo++;
            }
        }
        System.out.println("Number of Consonants: "+countCo);
    }
}
