import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = sc.nextLine();
        char ch[] = str.toCharArray();

        String newStr = "";
        for(int i=0; i<ch.length; i++){
            if (ch[i] != ' ') {
                newStr +=ch[i];
            }
        }
        System.out.println("Remove Spaces: "+newStr);
    }
}
