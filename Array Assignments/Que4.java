//Q4.Write a Java program to find the number of even and odd integers in a given array of integers.
public class Que4 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int even=0,odd=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even no.: "+even+"\nOdd No.: "+odd);
    }
}
