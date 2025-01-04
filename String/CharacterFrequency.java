import java.util.Scanner;
public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = sc.nextLine();
        char ch[] = str.toCharArray(); //hello
        boolean [] counted = new boolean[ch.length];
    
        for(int i=0; i<ch.length; i++){
            if (counted[i]) {
                continue;
            }
            int count=1;
            for(int j=i+1; j<ch.length; j++){
                if (ch[i] == ch[j]) {
                    count++;
                    counted[j] = true;
                }
            }
            System.out.println(ch[i]+"="+count);
        }
        }
    }

