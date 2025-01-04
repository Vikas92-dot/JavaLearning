import java.util.Scanner;

public class ValidPassword {

    public static boolean isValid(String str){

        char ch[] = str.toCharArray();
        boolean hasLower=false, hasUpper=false, hasDigit=false, hasSpecial=false;

        if (ch.length < 8 && ch.length > 15) {
            return false;
        }
        for(char c : ch){
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            else if (Character.isDigit(c)) {
                hasDigit = true;
            }
            else if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            else if ("@!#$%^&*".indexOf(c) != -1) {
                hasSpecial = true;
            }
        }
        return hasLower && hasDigit && hasSpecial && hasUpper;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = sc.next();
        
        if (isValid(str)) {
            System.out.println(str+" is valid password.");
        }
        else{
            System.out.println(str+" is invalid password.");
        }
                
    }
}
