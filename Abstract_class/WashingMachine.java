package Abstract_class;

public class WashingMachine extends Appliance{

	public WashingMachine(String brand, boolean isOn) {
		super(brand, isOn);
		// TODO Auto-generated constructor stub
	}
	void operate() {
		System.out.println("The washing machine is washing clothes.");
	}
	
}
