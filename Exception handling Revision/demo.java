public class demo {
    public static void main(String[] args) {
         try{
            String s1 = args[0];
            System.out.println("Welcome");

            String s2 = args[1];
            System.out.println("hello guys");

            int x = Integer.parseInt(s1);
            int y = Integer.parseInt(s2);
            System.out.println(x);
            System.out.println(y);
            int z=x/y;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please provide values."); // when we don't pass any value while running code
        }
        catch(NumberFormatException a){
            System.out.println("please provide integer value"); // when we give abc and xyz as argument
        }
        catch(ArithmeticException ss){
            System.out.println("do not divide by zero"); // when we pass 10 and 0 then this exception occur
        }
    }
}
