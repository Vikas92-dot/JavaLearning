//2. WAP to store integer values in arraylist and display only those values which are even.
import java.util.List;
import java.util.ArrayList;
public class Que2 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        for(Integer n:l){
            if (n%2 == 0) {
                System.out.println(n);
            }
        }
    }
}
