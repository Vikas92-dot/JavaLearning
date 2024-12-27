public class AnimalMain {
	public static void main(String args[]) {
		Animal brr[] = new Animal[2];
		brr[0] = new Dog();
		brr[1] = new Cat();
		
		brr[0].makeSound();
		brr[1].makeSound();
		
	}
}
