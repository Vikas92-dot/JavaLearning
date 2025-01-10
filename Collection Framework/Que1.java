//1. WAP to store string data in arraylist and convert all the names into upper case which starts from a.

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Que1 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("abhay");
        l.add("anas");
        l.add("sawan");
        l.add("anil");

        ListIterator itr = l.listIterator();
        while(itr.hasNext()) {
            String s = (String)itr.next();
            if (s.startsWith("a")) {
                s= s.toUpperCase();
            }
            System.out.println(s);
        }
        
    }
}
