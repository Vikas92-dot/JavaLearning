

public class Vehicle {
	public void speed() {
		System.out.println("Speed varies for different vehicles.");
	}
}
class Car extends Vehicle{
	public void speed() {
		System.out.println("The car speed is 120 km/h.");
	}
}
class Bike extends Vehicle{
	public void speed() {
		System.out.println("The bike speed is 80 km/h.");
	}
	
}
