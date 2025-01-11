import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Scanner;

public class Que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Integer arraylist.");
        int size = sc.nextInt();

        List<Integer> l = new ArrayList<Integer>(size);
        for(int i=0; i<size; i++){
            System.out.println("Enter string at index "+(i+1)+":");
            l.add(sc.nextInt());
        }
    
        System.out.println("Enter elements to be searched in an arraylist:");
        int search = sc.nextInt();
        System.out.println("Enter elements to be remove from an arraylist:");
        int rem = sc.nextInt();

        System.out.println("Output:------------------------------");
        boolean flag = false;
        for(Integer num: l){
            if (num.equals(search)) {
                flag=true;
            }
        }
        if (flag) {
            System.out.println("Number "+search+" exists in the ArrayList");
        }
        else{
            System.out.println("Number "+search+" not exists in the ArrayList");
        }
        
        Iterator<Integer> it = l.iterator();
        
        while (it.hasNext()) {
            if (it.next() == rem) {
                it.remove();
            }
        }
        System.out.println("ArrayList after removing "+rem);
        System.out.println(l);

        // for(Integer num: l){
        //     if (num.equals(rem)) {
        //         l.remove(l.indexOf(num));
        //     }
        // }
        

        System.out.println("ArrayList elements using normal for loop");
        for(int i=0; i<size-1; i++){
        
            System.out.print(l.get(i)+" ");
            
        }
        System.out.println();
        System.out.println("ArrayList elements using Iterator interface");
        
        ListIterator itr = l.listIterator();
        while (itr.hasNext()) {
            Integer n = (Integer)itr.next();
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("ArrayList elements using for-each loop");
        for(Integer n:l){
            System.out.print(n+" ");
        }
        System.out.println();

        System.out.println("ArrayList elements in descending order");
        
        l.sort(Comparator.reverseOrder());
        System.out.println(l);
        
        System.out.println("Number of Elements:"+l.size());
    }
}
