public class OnlinePurchaseTransaction extends Transaction {
        private String merchant;

        public OnlinePurchaseTransaction(int transactionId,double amount,String merchant){
            super(transactionId, amount);
            this.merchant = merchant;
        }

        public String getMerchant() {
            return merchant;
        }

        public void setMerchant(String merchant) {
            this.merchant = merchant;
        }
        
}
