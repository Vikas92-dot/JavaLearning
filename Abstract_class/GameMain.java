package Abstract_class;
import java.util.Scanner;
public class GameMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose a character (1. Warrior, 2. Wizard):");
        int choice = sc.nextInt();
        GameCharacter character;
        switch (choice) {
            case 1: 
                        System.out.println("Enter the strength: ");
                        int N = sc.nextInt();
                        if(N <= 106) {
                        	character = new Warrior(N);
                            character.attack();
                            character.defend();
                        }
                        else {
                        	System.out.println("Enter valid values..");
                        	return;
                        }
                        
                break;
            case 2:
                        System.out.println("Enter the Magic power: ");
                        int M = sc.nextInt();
                        if(M >= 1) {
                        	character = new Wizard(M);
                            character.attack();
                            character.defend();
                        }
                        else {
                        	System.out.println("Enter valid values..");
                        	return;
                        }
                        
                break;
        
            default:    System.out.println("Invalid choice");
                break;
        }
    }
}

