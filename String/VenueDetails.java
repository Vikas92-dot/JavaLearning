import java.util.Scanner;

public class VenueDetails {
    private String venueName;
    private String city;

    VenueDetails(String venueName, String city){
        this.venueName = venueName;
        this.city = city;
    }

    public void display(){
        System.out.println("Venue Details:");
        System.out.println("Venue Name: "+venueName);
        System.out.println("City Name: "+city); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = sc.nextLine();
        
        String str1[] = str.split(",");
        VenueDetails obj = new VenueDetails(str1[0], str1[1]);
        obj.display();               
    }
}
