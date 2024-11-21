import java.util.Scanner;
class ArrayContains{
    public static void main(String args[]){
        int arr[]={4,6,8,2,7,6,9,4,2,53,74};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. Which you want to find..");
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                flag=true;
            }
        }
        if(flag){
            System.out.println("Element Contain..");
        }
        else {
            System.out.println("Not Contain.");
        }
    }
}