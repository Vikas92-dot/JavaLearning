import java.util.Scanner;

public class Hagrid {

    public static void calculateRoot(int n){
        double squareRoot = Math.sqrt(n);
        System.out.printf("%.1f",squareRoot);
    }
    public static void calculateRoot(double d){
        double cubeRoot = Math.cbrt(d);
        System.out.println(cubeRoot);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (integer for square root, double for cube root):");
        String input = sc.nextLine();

        if (input.contains(".")) {
            double doubleIn = Double.parseDouble(input);
            calculateRoot(doubleIn);
        }
        else{
            int integerIn = Integer.parseInt(input);
            calculateRoot(integerIn);
        }
    }
}
