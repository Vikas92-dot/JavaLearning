import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

class Product{
    private int pid;
    private String pname;
    private double pprice;
    private String plocation;
    public Product() {
    }
    public Product(int pid, String pname, double pprice, String plocation) {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
        this.plocation = plocation;
    }
    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public double getPprice() {
        return pprice;
    }
    public void setPprice(double pprice) {
        this.pprice = pprice;
    }
    public String getPlocation() {
        return plocation;
    }
    public void setPlocation(String plocation) {
        this.plocation = plocation;
    }
    @Override
    public String toString() {
        return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", plocation=" + plocation + "]";
    }    
}
public class Que8 {
    public static void main(String[] args) {
        
        ArrayList<Product> al = new ArrayList<Product>(5);
        
        Product p1 = new Product(101,"bottle",250.00,"indore");
        Product p2 = new Product(102,"watch",1000.00,"ujjain");
        Product p3 = new Product(103,"ring",600,"indore");
        Product p4 = new Product(104,"cover",100,"indore");
        Product p5 = new Product(105,"charger",250.00,"indore");
        al.add(p1);
        al.add(p2);
        al.add(p3);
        al.add(p4);
        al.add(p5);
        for(Product p: al){
            System.out.println(p);
        }
        ListIterator itr = al.listIterator();

        System.out.println("display only those products whose price is above 500.");
        while (itr.hasNext()) {
            Product pro = (Product)itr.next();
            if (pro.getPprice() > 500) {
                System.out.println(pro);
            }
        }
    }

}
