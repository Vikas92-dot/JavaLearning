public class BillPaymentTransaction extends Transaction {
    private String billType;

    public BillPaymentTransaction(int transactionId,double amount,String billType){
        super(transactionId, amount);
        this.billType = billType;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }
    
}
