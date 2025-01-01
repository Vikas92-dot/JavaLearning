import java.util.Scanner;
interface PaymentGateway {
    void processPayment(double amount);
}
class CreditCardPayment implements PaymentGateway{
    public void processPayment(double amount){
        System.out.println("Processing done with credit card..");
    }
}
class UPIPayment implements PaymentGateway{
    public void processPayment(double amount){
        System.out.println("Processing done with with UPI..");
    }
}

public class PaymentGatewayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Payment method press 1 for Credit card or Press 2 for UPI payment.");
        int choice = Integer.parseInt(sc.nextLine());
        PaymentGateway obj;
        switch (choice) {
            case 1:
                    obj = new CreditCardPayment();
                    System.out.println("Enter amount: ");
                    double amt = Double.parseDouble(sc.nextLine());
                    obj.processPayment(amt);
                break;
            case 2:
                    obj = new UPIPayment();
                    System.out.println("Enter amount: ");
                    double amount = Double.parseDouble(sc.nextLine());
                    obj.processPayment(amount);
                break;
        
            default:  System.out.println("Invalid choice..");
                break;
        }
    }
}
