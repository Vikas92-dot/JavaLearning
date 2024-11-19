// Q.8
// Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

// Example 1:
// Input : 
// N = 8
// arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
// Output : 
// 1  3  2  11  6  -1  -7  -5
import java.util.Scanner;
class Q8{
    public static void main(String args[]){
        int arr[]={-5,7,-3,-4,9,10,-1,11};
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]<0){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
           
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }



        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the length of Array");
        // int n=sc.nextInt();
        // int arr[]=new int[n];
       

        // System.out.println("Enter the Elements of Array.");
        // for(int i=0; i<arr.length; i++){
        //     arr[i]=sc.nextInt();
        // }
        
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr.length-1; j++){
        //     if (arr[j]<0) {
        //         if(arr[j+1] >= 0){
        //         int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
               
        //     }
            
        // }
        
        // System.out.println("placing all negative element at the end");
        // for(int i = 0;i < arr.length;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
       
       
    }
}

    
