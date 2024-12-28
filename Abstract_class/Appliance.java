package Abstract_class;

public abstract class Appliance {
		private String brand;
		private boolean isOn;
		
		public Appliance(String brand, boolean isOn) {
			this.brand = brand;
			this.isOn = isOn;
		}
		abstract void operate();
		
		void turnOn() {
			isOn = true;
			System.out.println("The appliance is now ON.");
		}
		void turnOff() {
			isOn = false;
			System.out.println("The appliance is now OFF.");
		}
			
}

