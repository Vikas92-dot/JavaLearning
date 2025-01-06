import java.io.*;
public class Third {
    public static void main(String[] args) {
        System.out.println("Main start");
        try{

            PrintWriter pw = new PrintWriter("abc.txt"); // It could lead exception at runtime so that we have to add try catch block because it is a checked exception 
            pw.write("Hello guys");
        }
        catch(FileNotFoundException e){
            System.out.println("File not created.");
        }

        System.out.println("Necessary code.");
    }
}
