// Q.7 Sub array with given sum
// Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to
// a given number S.

// Example 1:
// Input:
// N = 5, S = 12
// A[] = {1,2,3,7,5}
// Output: 2 4
// Explanation: The sum of elements 
// from 2nd position to 4th position 
// is 12.
import java.util.Scanner;
class Q7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the Elements of Array.");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Sum of sub array: ");
        int s=sc.nextInt();
        int count=0;
        int a=0;
        int i;
        for(i=0; i<arr.length-1; i++){
            int sum = 0;
            for(int j = i;j < arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum==s)
                  {
                    a = j;
                    count++;
                    break;
                  }
                }
                if(count>0)
                    break;
            }
            if(count>0)
            {
                System.out.print("Position number "+(i+1)+" to position number "+(a+1)+" sum is equals to "+s);
            }
            else
            {
                System.out.print("No sum of array found ");

        }
       

    }
}