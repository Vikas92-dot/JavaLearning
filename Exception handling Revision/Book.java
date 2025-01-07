import java.util.Scanner;

class InvalidQuantityException extends RuntimeException{
    InvalidQuantityException(String msg){
        super(msg);
    }
}
public class Book {
    private String id;
    private String bookTitle;
    private String authorName;
    private float price;
    private int quantity;

    public Book(String id, String bookTitle, String authorName, float price, int quantity) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.quantity = quantity;
    }
    public void purchase(int pQty){
        try{
            if (pQty > quantity) {
                throw new InvalidQuantityException("Quantity not available");
            }
            System.out.println("Quantity Available: "+(quantity-pQty));
            
        }
        catch(InvalidQuantityException e){
            System.out.println("InvalidQuantityException: Quantity not available");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book Id: ");
        String id = sc.nextLine();
        System.out.println("Enter book Title: ");
        String title = sc.nextLine();
        System.out.println("Enter book Author Name: ");
        String authorName = sc.nextLine();
        System.out.println("Enter book Price: ");
        float price = Float.parseFloat(sc.nextLine());
        System.out.println("Enter book Qty available: ");
        int qtyAv = Integer.parseInt(sc.nextLine());
        System.out.println("Enter book Qty purchased: ");
        int qtyPur = Integer.parseInt(sc.nextLine());

        Book obj = new Book(id, title, authorName, price, qtyAv);
        obj.purchase(qtyPur);
    }
}
