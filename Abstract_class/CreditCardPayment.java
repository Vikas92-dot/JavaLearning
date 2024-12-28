package Abstract_class;

public class CreditCardPayment extends Payment {
	private String cardNumber;

	public CreditCardPayment(double amount,String transactionId,String cardNumber) {
		super(amount, transactionId);
		this.cardNumber = cardNumber;
		
	}
	void processPayment() {
		System.out.println("Processing credit card payment for amount:"+getAmount());
	}
		
}
