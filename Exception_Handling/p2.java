package Exception_Handling;

//Nested try catch
public class p2 {
    public static void main(String[] args) {
    int a=10;
    int b=0;
    int c;
    int arr[]={1};
        try{
            c=a/b;
            
        }
        catch(ArithmeticException p){
            try {
                System.out.println(arr[5]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println(p.toString());
        }
    }
}
