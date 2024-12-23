public class SecondMain {
    public static void main(String[] args) {
        PeerToPeerTransaction obj = new PeerToPeerTransaction(101,10000.50,"Abhay");
        OnlinePurchaseTransaction obj1 = new OnlinePurchaseTransaction(102,5000.30,"Vikas");
        BillPaymentTransaction  obj2 = new BillPaymentTransaction(103,6300.60,"Online");

        System.out.println("Peer-to-Peer Transaction:");
        System.out.println("Transaction ID: "+obj.getTransactionId()+"\nAmount: "+obj.getAmount()+"\nRecipient: "+obj.getRecipient());
        System.out.println("=========================================");
        System.out.println("Online Purchase Transaction:");
        System.out.println("Transaction ID: "+obj1.getTransactionId()+"\nAmount: "+obj1.getAmount()+"\nMerchant: "+obj1.getMerchant());
        System.out.println("=========================================");
        System.out.println("Bill Payment Transaction:");
        System.out.println("Transaction ID: "+obj2.getTransactionId()+"\nAmount: "+obj2.getAmount()+"\nBill Type: "+obj2.getBillType());
        System.out.println("=========================================");
        
    }
}
