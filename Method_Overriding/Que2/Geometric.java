import java.util.Scanner;
abstract class Series{
	abstract void nextTerm();
}
class GeometricSeries extends Series{
	private int resources;
	private int growth;
	private int planets;

	public GeometricSeries() {
		
	}
	public GeometricSeries(int r , int g , int p) {
		this.resources = r;
		this.growth = g;
		this.planets = p;
	}
	void nextTerm() {
	for(int i = 0 ; i < planets; i++) {
		System.out.print(resources +" ");
		resources = resources*growth;
	}
	}
}
public class Geometric {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the collecting resources on each planet :  ");
		int resources = sc.nextInt();
		System.out.print("Enter the growth ration :  ");
		int ratio = sc.nextInt();
		System.out.print("Enter the number of planets : ");
		int planets = sc.nextInt();

		if((resources >=1 && resources <=10 ) && (ratio >=1 && ratio<=10) && (planets >=1 && planets <=8)) {

		GeometricSeries obj = new GeometricSeries(resources , ratio , planets);
		obj.nextTerm();
		}
		else {
		System.err.println("Value cann't be greater than 10 in case of planet 8,  and also not less that 1");
		}

		
	}

}