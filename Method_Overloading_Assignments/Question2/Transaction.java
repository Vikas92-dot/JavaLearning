public class Transaction {
    private int transactionId;
    private double amount;
    

    public Transaction() {
    }

    public Transaction(int transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }
    
    public int getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
        
}
