import java.io.PrintWriter;

public class Test1 {
    public static void main(String[] args) {
        try{
            int x = 10/0; //We can write try without catch in case of Runtime exception/Unchecked

            //But we have to apply catch in checked exception
            // PrintWriter pw = new PrintWriter("xyz.txt"); //checked exception
            // pw.write("Hii...guys");
        }
        finally{
            System.out.println("finally block");
        }
    }
}
