//Q.2 Find minimum and maximum element in array 
import java.util.Scanner;
class Q2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length.");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int min,max;

        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }
         min=arr[0]; max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Min:"+min+" & "+"Max:"+max);
        }
        
    }
