package Exception_Handling;

public class B {
    public static void main(String[] args) {
        try {
            System.out.println("hiii");
            //Nested try for null pointer exception 
            try {
              String a = null;
              System.err.println(a.length());
            } catch (ArrayIndexOutOfBoundsException n) {
              System.out.println(n);
              System.exit(1);
            }
            //Nested try for arithmatic exception 
            finally{
            try {
              int r = 5 / 0;
              System.out.println(r);
            } catch (ArithmeticException e) {
              System.out.println(e);
            }
          }
          } catch (Exception e) {
            System.out.println("My Exception :" + e.getMessage());
          }
    }
}
