import java.io.*;
class A{
    int test1(){
        try{
            String str = null;
            int x=str.length();
            // return 90;
        }
        catch(NullPointerException ee){
            System.out.println(ee);
            return 30;
        }
        // catch(Exception e){
        //     return 30;
        // }
        return 60;
    }
}

public class Second {
    public static void main(String[] args) {
        System.out.println("main start");

        A obj = new A();
        System.out.println(obj.test1());
        System.out.println("Necessary code");
    }
}
