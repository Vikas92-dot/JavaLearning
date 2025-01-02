import java.util.Scanner;

interface NumberInput {
    void numInput(int n);

}
interface AutomorphicChecker {
    default void checker(int n){
        int rem=0,res=1,d=0;
        int temp=n; int count=0;

        while (temp > 0) {
            int r = temp%10;
            count++;
            temp = temp/10;
        }

        for(int i=1; i<=count; i++){
            res = res*10;
        }
            d = n*n;
            rem = d % res;

        if (n == rem) {
            System.out.printf("%d is an automorphic Number.",n);
        }
        else
        System.out.printf("%d is not an automorphic Number.",n);
    }
}

public class AutomorphicNumber implements NumberInput,AutomorphicChecker {
    int num;
    public void numInput(int n){
        this.num = n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to check No. is an automorphic or not..");
        int n = sc.nextInt();

        if (n < 1 || n > 500) {
            System.out.println("Please enter valid number..Between 1 to 500.");
            return;
        }
        else{
            AutomorphicNumber obj = new AutomorphicNumber();
            obj.numInput(n);
            obj.checker(n);
        }
        

    }
}
