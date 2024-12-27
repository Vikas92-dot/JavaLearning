

public class Bank {
	public int getInterestRate() {
		return 0;
	}
}
class SBI extends Bank{
	public int getInterestRate() {
		return 5;
	}
}
class ICICI extends Bank{
	public int getInterestRate() {
		return 6;
	}
}
class AXIS extends Bank{
	public int getInterestRate() {
		return 7;
	}
}