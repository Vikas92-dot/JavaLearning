public class Pizza {
    private double basePrice;
    private double costPerTopping;
    private int numOfTopping;

    public Pizza(double basePrice, double costPerTopping, int numOfTopping) {
        this.basePrice = basePrice;
        this.costPerTopping = costPerTopping;
        this.numOfTopping = numOfTopping;
    }

    
    public double getBasePrice() {
        return basePrice;
    }


    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }


    public double getCostPerTopping() {
        return costPerTopping;
    }


    public void setCostPerTopping(double costPerTopping) {
        this.costPerTopping = costPerTopping;
    }


    public int getNumOfTopping() {
        return numOfTopping;
    }


    public void setNumOfTopping(int numOfTopping) {
        this.numOfTopping = numOfTopping;
    }


    public void calculatePrice(){
        double price = basePrice+(costPerTopping*numOfTopping);
        System.out.printf("%.2f",price);
    }   
}
class DiscountedPizza extends Pizza{
    public DiscountedPizza(double basePrice,double costPerTopping,int numOfTopping){
        super(basePrice, costPerTopping, numOfTopping);
    }
    public void calculatePrice(){
        if (getNumOfTopping() > 3) {
            double disPrice = (getBasePrice()+(getCostPerTopping()*getNumOfTopping()))*.90;
            System.out.printf("%.2f",disPrice);
        }
        else{
            super.calculatePrice();
        }
    }
}