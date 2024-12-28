package Abstract_class;


public class Refrigerator extends Appliance{

	public Refrigerator(String brand, boolean isOn) {
		super(brand, isOn);
		// TODO Auto-generated constructor stub
	}
	void operate() {
		System.out.println("The refrigerator is cooling items.");
	}
}

