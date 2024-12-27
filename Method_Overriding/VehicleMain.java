

public class VehicleMain {
	public static void main(String args[]) {
		Vehicle drr[] = new Vehicle[3];
		drr[0] = new Vehicle();
		drr[1] = new Car();
		drr[2] = new Bike();
		
		
		drr[0].speed();
		drr[1].speed();
		drr[2].speed();
	}
}
