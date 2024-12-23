public class PeerToPeerTransaction extends Transaction {
    private String recipient;

    public PeerToPeerTransaction(int transactionId,double amount,String recipient){
        super(transactionId, amount);
        this.recipient = recipient;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    

}
