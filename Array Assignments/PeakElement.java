// Q.1 Peak an element

// An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
// Given an array arr[] of size N, find the index of any one of its peak elements.
// Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.

// Example 1:
// Input:
// N = 3
// arr[] = {1,2,3}
// Output: 1
// Explanation: index 2 is 3.
// It is the peak element as it is 
// greater than its neighbour 2.
// Example 2:
// Input: 
// N = 2
// arr[] = {3,4}
// Output: 1
// Explanation: 4 (at index 1) is the 
// peak element as it is greater than 
// its only neighbour element 3.
// Constraints:
// 1 ≤ N ≤ 105
// 1 ≤ A[] ≤ 106


import java.util.Scanner;
class PeakElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length of an array..");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0; i<arr.length; i++){
        System.out.println("Please Enter Element at "+(i+1)+":");
        arr[i]=sc.nextInt();
    }

    //    int arr[] = {7,7,3,2,5,8,14,17};
       boolean flag=false;
       if (n==1) {
        System.out.println(arr[0]);
        flag=true;        
       }
       if(n>1){
       if (arr[0] >=arr[1]) {
        System.out.println(arr[0]);
        flag=true; 
       }
       if (arr[n-1]>=arr[n-2]) {
        System.out.println(arr[n-1]);
        flag=true; 
       }
       for(int i=1; i<n-1; i++){
        if (arr[i]>=arr[i-1] && arr[i]>=arr[i+1]) {
            System.out.println(arr[i]);
            flag=true; 
        }
    }
       }
       if(flag){
        System.out.println("Peak Element Present (1)");
       }
       else System.out.println("Peak Element not present (0)");
    }
    }





















