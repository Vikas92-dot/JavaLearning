import java.util.Scanner;

public class LoyaltyPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount spent by the customer:");
        int amountSpent = sc.nextInt();

        System.out.println("Is the customer a premium customer? (yes/no): ");
        String isPremium = sc.next();

        Customer customer;
        if (isPremium.equals("yes")) {
             customer = new PremiumCustomer(amountSpent);
        }
        else {
             customer = new Customer(amountSpent);
        }

        System.out.println("Loyalty Points: "+customer.calculateLoyaltyPoints());
        
    }
}
