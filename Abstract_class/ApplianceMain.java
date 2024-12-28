package Abstract_class;

public class ApplianceMain {
	public static void main(String args[]) {
		Appliance obj = new WashingMachine("Whirlpool", false);
		Appliance obj1 = new Refrigerator("LG", false);
		
		System.out.println("Washing Machine:");
		obj.turnOn();
		obj.operate();
		obj.turnOff();
		System.out.println();
		System.out.println("Refrigerator:");
		obj1.turnOn();
		obj1.operate();
		obj1.turnOff();
		
	}
}
