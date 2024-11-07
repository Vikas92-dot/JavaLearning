import java.util.Scanner;
class DmartBill{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name"); 
    String name=sc.nextLine();
    System.out.println("Enter your gender");
    String gender=sc.next();  
    
    
    //Item 1

    System.out.println("Enter First Item..");
    String item_1=sc.next();
    System.out.println("Enter 1st Qty.");
    int qty_1=sc.nextInt();
    System.out.println("Enter 1st Price");
    int price_1=sc.nextInt();
    double cost_1=qty_1*price_1;
    double V;

    if (qty_1>4) {
       
        V=((cost_1*95)/100);   
    }else{
        V=cost_1;
    }
    

     //Item 2

     System.out.println("Enter Second Item..");
     System.out.println("Enter 2nd Qty.");
     System.out.println("Enter 2nd Price");
     String item_2=sc.next();
     int qty_2=sc.nextInt();
     double price_2=sc.nextInt();
     double cost_2=qty_2*price_2;


     //Item 3

     System.out.println("Enter Third Item..");
     System.out.println("Enter 3rd Qty.");
     System.out.println("Enter 3rd Price");
     String item_3=sc.next();
     int qty_3=sc.nextInt();
     double price_3=sc.nextInt();
     double cost_3=qty_3*price_3;

     //Item 4

     System.out.println("Enter Fourth Item..");
     System.out.println("Enter 4th Qty.");
     System.out.println("Enter 4th Price");
     String item_4=sc.next();
     int qty_4=sc.nextInt();
     double price_4=sc.nextInt();
     double cost_4=qty_4*price_4;

     //Item 5

     System.out.println("Enter Five Item..");
     System.out.println("Enter 5th Qty.");
     System.out.println("Enter 5th Price");
     String item_5=sc.next();
     int qty_5=sc.nextInt();
     int price_5=sc.nextInt();
     double cost_5=qty_5*price_5;

     double after_dis_5=((cost_5*90)/100);

     //Item 6

     System.out.println("Enter Sixth Item..");
     System.out.println("Enter 6th Qty.");
     System.out.println("Enter 6th Price");
     String item_6=sc.next();
     int qty_6=sc.nextInt();
     double price_6=sc.nextInt();
     double cost_6=qty_6*price_6;

     //Item 7

     System.out.println("Enter Seventh Item..");
     System.out.println("Enter 7th Qty.");
     System.out.println("Enter 7th Price");
     String item_7=sc.next();
     int qty_7=sc.nextInt();
     double price_7=sc.nextInt();
     double cost_7=qty_7*price_7;

     //Item 8

     System.out.println("Enter Eighth Item..");
     System.out.println("Enter 8th Qty.");
     System.out.println("Enter 8th Price");
     String item_8=sc.next();
     int qty_8=sc.nextInt();
     double price_8=sc.nextInt();
     double cost_8=qty_8*price_8;

     //Item 9

     System.out.println("Enter Ninth Item..");
     System.out.println("Enter 9th Qty.");
     System.out.println("Enter 9th Price");
     String item_9=sc.next();
     int qty_9=sc.nextInt();
     double price_9=sc.nextInt();
     double cost_9=qty_9*price_9;

     //Item 10

     System.out.println("Enter Tenth Item..");
     System.out.println("Enter 10th Qty.");
     System.out.println("Enter 10th Price");
     String item_10=sc.next();
     int qty_10=sc.nextInt();
     double price_10=sc.nextInt();
     double cost_10=qty_10*price_10;

     double actual_price=(cost_1+cost_2+cost_3+cost_4+cost_5+cost_6+cost_7+cost_8+cost_9+cost_10);
     double dis_price=(V+cost_2+cost_3+cost_4+cost_5+cost_6+cost_7+cost_8+cost_9+cost_10);

     System.out.println("Do you want Carry Bag? Type 'Yes' or 'No' ");
     String carry=sc.next();

     double gst=((actual_price*10)/100);
     double carry_amt =10;
     double final_ap=(actual_price+carry_amt+gst);
     double final_dp=(dis_price+carry_amt+gst);

     
    

     System.out.println("-------------------------------------------D-Mart-------------------------------------------");
     System.out.print("Name  : "+name);
     System.out.print("\nGender :"+gender); System.out.println("\t\t\t\t\t\t\t\tDate:22-05-2024");
     System.out.println("--------------------------------------------------------------------------------------------");
     System.out.println("Item Name\t\tQuantity\t\tPrice\t\tTotal\t\tAfter-Discount");
     System.out.println("--------------------------------------------------------------------------------------------");
     System.out.println(item_1+"\t\t\t"+qty_1+"\t\t\t"+price_1+"\t\t"+cost_1+"\t\t"+V);
     System.out.println(item_2+"\t\t\t"+qty_2+"\t\t\t"+price_2+"\t\t"+cost_2+"\t\t"+cost_2);
     System.out.println(item_3+"\t\t\t"+qty_3+"\t\t\t"+price_3+"\t\t"+cost_3+"\t\t"+cost_3);
     System.out.println(item_4+"\t\t\t"+qty_4+"\t\t\t"+price_4+"\t\t"+cost_4+"\t\t"+cost_4);
     System.out.println(item_5+"\t\t\t"+qty_5+"\t\t\t"+price_5+"\t\t"+cost_5+"\t\t"+after_dis_5);
     System.out.println(item_6+"\t\t\t"+qty_6+"\t\t\t"+price_6+"\t\t"+cost_6+"\t\t"+cost_6);
     System.out.println(item_7+"\t\t\t"+qty_7+"\t\t\t"+price_7+"\t\t"+cost_7+"\t\t"+cost_7);
     System.out.println(item_8+"\t\t\t"+qty_8+"\t\t\t"+price_8+"\t\t"+cost_8+"\t\t"+cost_8);
     System.out.println(item_9+"\t\t\t"+qty_9+"\t\t\t"+price_9+"\t\t"+cost_9+"\t\t"+cost_9);
     System.out.println(item_10+"\t\t\t"+qty_10+"\t\t\t"+price_10+"\t\t"+cost_10+"\t\t"+cost_10);
     System.out.println("--------------------------------------------------------------------------------------------");
     System.out.println("--------------------------------------------------------------------------------------------");
     
     System.out.println("\t\t\t\t\t\t\t\tA.P.\t\tD.P.");
     System.out.println("\t\t\t\t\t\t\t\t"+actual_price+"\t\t"+dis_price);
     
     if (gender=="female") {
        System.out.println("Gift: Cadeberry\t\t\t\t\t\t\t0.00\t\t0.00");
        
     }
     else System.out.println("Gift: Lather Wallet\t\t\t\t\t\t0.00\t\t0.00");
    
    if (carry == "yes") {
      
        
    System.out.println("Carry Bag: "+carry+"\t\t\t\t\t\t"+carry_amt+"\t\t"+carry_amt);

    }
    else System.out.println("Carry Bag: "+carry+"\t\t\t\t\t\t0.00\t\t0.00");
    System.out.println("GST (10%)\t\t\t\t\t\t\t"+gst+"\t\t"+gst);
    System.out.println("--------------------------------------------------------------------------------------------");
    System.out.println("\t\t\t\t\t\t\t\t"+final_ap+"\t\t"+final_dp);
    
    System.out.println("\t\t\t\t\t\tThank You");
    System.out.println("\t\t\t\t\t\t To Visit");
    System.out.println("\t\t\t\t\t\t  D-Mart");
}
}