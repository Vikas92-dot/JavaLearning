// 4. Modify an ArrayList
// Objective: Develop a program to perform operations on an ArrayList.
// Tasks:
// Add 5 integers to an ArrayList.
// Replace the second element with a new integer.
// Remove the third element.
// Display the updated ArrayList.

import java.util.ArrayList;
import java.util.List;

public class Que4 {
    public static void main(String[] args) {
    List<Integer> l = new ArrayList<Integer>();
        l.add(6);
        l.add(12);
        l.add(28);
        l.add(15);
        l.add(496);

        l.set(1,500);//replace second element with new int
        l.remove(2);
        System.out.println(l);
}
}
