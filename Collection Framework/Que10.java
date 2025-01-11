import java.util.LinkedList;
import java.util.Scanner;

public class Que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of books.");
        int num = Integer.parseInt(sc.nextLine());

        LinkedList<String> ll = new LinkedList<String>();
        for(int i=0; i<num; i++){
            String s = sc.nextLine();
            ll.add(s);
        }
        System.out.println("Books in the inventory:");
        for(String book:ll){
            System.out.println(book);
        }
    }    
}
