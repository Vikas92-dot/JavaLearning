import java.io.*;
class A{
    void test1() throws FileNotFoundException
    {
        test2();
    }
    void test2() throws FileNotFoundException
    {
        test3();
    }
    void test3() throws FileNotFoundException
    {
        //unchecked exception //Auto ducking send exception object to calling method
        // int x=10/0; //if we apply try catch in main method then this code will run fine
        
        PrintWriter pw = new PrintWriter("xyz.txt");    //checked exception
        pw.write("Hii...guys");  //if we apply try catch in main method then this code will  not run because autoducking not possible we need to throws or try catch here
        

        pw.close();
    }
}
public class Throws {
    public static void main(String[] args) //we can throws exception to JVM from here
     {
        try{
            A obj =new A(); 
            obj.test1();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Necessary code.");
    }
}
