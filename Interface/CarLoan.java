import java.util.Scanner;

interface Principal {
    void principalAmt(double p);
    
}
interface IntrestRate {
    void intrestRate(double r,double t);
    
}

public class CarLoan implements Principal,IntrestRate {
    private double p;
    private double r;
    private double t;

    public void principalAmt(double amt){
        this.p = amt;
    }
    public void intrestRate(double rate,double duration){
        this.r = rate;
        this.t = duration; 
    }
    void calculation(){
        double res = p*r*t;
        System.out.printf("Total intrest paid: Rs.%.2f",res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount:");
        double p = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the rate of intrest:");
        double r = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the loan duration:");
        double d = Double.parseDouble(sc.nextLine());

        System.out.print("Submit Code!");
        sc.nextLine();

        if (p < 1.00 || p > 1000000.00 || r < 0.01 || r > 0.99 || d < 1) {
            System.out.println("Invalid input values!");
            return;
        }
        else{

            CarLoan obj = new CarLoan();
            obj.principalAmt(p);
            obj.intrestRate(r,d);
            obj.calculation();
            
        }

    }
}
