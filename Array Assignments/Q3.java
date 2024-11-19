//Q.3 Write a program to reverse the array.
import java.util.Scanner;
class Q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length.");
        int size=sc.nextInt();
        int arr[]=new int[size]; 
        

        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }
        int i=0; int j=arr.length-1; 
        
        while (i<=j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++; j--;
            
        }
        System.out.println("Reverse Array:");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
       }
        
        
        }
        
    }
