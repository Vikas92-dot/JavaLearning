// 5. Search in an ArrayList
// Objective: Write a program to search for an element in an ArrayList.

// Tasks:

// Allow the user to enter multiple strings into an ArrayList.
// Prompt the user to enter a string to search for.
// Check if the string exists in the list and display its position(s).

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of String array.");
        int size = sc.nextInt();
        
        List<String> l = new ArrayList<String>(size);
        
        for(int i=0; i<size; i++){
            System.out.println("Enter string at index "+(i+1)+":");
            l.add(sc.next());
        }
        System.out.println("Enter any string exist or not.");
        String s = sc.next();
        
        if (l.contains(s)) {
            for(String str:l){
                if (str.equals(s)) {
                    System.out.println("Position at: "+l.indexOf(str));
                }
            }
        }
        else{
            System.out.println("Not exist..");
        }
        
        
    }
}
