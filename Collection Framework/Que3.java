//3. WAP to store integer values in arraylist and display only those numbers which are perfect numbers.

import java.util.ArrayList;
import java.util.List;

public class Que3 {
    public static boolean isPerfect(int n){
        boolean flag = false;
        int res=0;
        for(int i=1; i<n; i++){
            if (n%i == 0) {
                res += i;
            }
        }
        if (res == n) {
            flag=true;
        }
        return flag;
    }
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(6);
        l.add(12);
        l.add(28);
        l.add(15);
        l.add(496);
        for(Integer n:l){
            if (isPerfect(n)) {
                System.out.println("Perfect Number: "+n);
            }
        }
    }
}
