package Abstract_class;

public abstract class Payment {
		private double amount;
		private String transactionId;
		
		public Payment(double amount, String transactionId) {
			this.amount = amount;
			this.transactionId = transactionId;
		}
		
		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public String getTransactionId() {
			return transactionId;
		}

		public void setTransactionId(String transactionId) {
			this.transactionId = transactionId;
		}

		abstract void processPayment();
		
		void displayDetails() {
			System.out.println("TransactionId "+transactionId+" and amount: "+amount);
		}
		
		
}
