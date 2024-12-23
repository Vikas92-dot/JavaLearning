import java.util.Scanner;

public class Customer {
    protected int amountSpent;

    
    public Customer(int amountSpent) {
        this.amountSpent = amountSpent;
    }


    public int calculateLoyaltyPoints(){
        return amountSpent/10 ;
    }
}
class PremiumCustomer extends Customer{

    public PremiumCustomer(int amountSpent){
        super(amountSpent);
    }

    public int calculateLoyaltyPoints(){
        return 2 * (amountSpent / 10);
    }

    
}
