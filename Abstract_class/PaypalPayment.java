package Abstract_class;

public class PaypalPayment extends Payment {
		private String paypalId;

		public PaypalPayment(double amount, String transactionId) {
			super(amount, transactionId);
		}
		
		void processPayment() {
			System.out.println("Processing PayPal payment for amount:"+getAmount());
		}
		
		
}
