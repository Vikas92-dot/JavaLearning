public class BankMain {
	public static void main(String args[]) {
		Bank crr[] = new Bank[4];
		crr[0] = new Bank();
		crr[1] = new SBI();
		crr[2] = new ICICI();
		crr[3] = new AXIS();
		
		for(int i=0; i<crr.length; i++) {
			System.out.println(crr[i].getInterestRate());
		}
	}
}
