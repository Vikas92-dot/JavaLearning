package Abstract_class;

public class PaymentMain {
	public static void main(String args[]) {
		Payment obj = new CreditCardPayment(2356.14,"p7899","454500");
		Payment obj1 = new PaypalPayment(200.56,"P4545");
		
		System.out.println("Credit Card Payment:");
		obj.processPayment();
		obj.displayDetails();
		
		System.out.println("Paypal Payment:");
		obj1.processPayment();
		obj1.displayDetails();
		
	}
}
