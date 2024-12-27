import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base price of the pizza..");
        double basePrice = sc.nextDouble();

        System.out.println("Enter the cost per toppings of the pizza..");
        double costPerTopping = sc.nextDouble();

        System.out.println("Enter the Number of toppings of the pizza..");
        int numOfTopping = sc.nextInt();
        
        if (basePrice < 0 || costPerTopping < 0  || (numOfTopping < 1 || numOfTopping > 10)) {
            System.out.println("Please enter correct values");
            return;
        }
        else{
            Pizza obj1 = new Pizza(basePrice, costPerTopping, numOfTopping);
            Pizza obj2 = new DiscountedPizza(basePrice, costPerTopping, numOfTopping);

            System.out.print("Price without discount: Rs."); obj1.calculatePrice();
            System.out.println();
            System.out.print("Price with discount: Rs."); obj2.calculatePrice();
        }

    }
}
