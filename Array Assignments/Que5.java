// Q5.Write a Java program to check if the sum of all the 10's in the array is exactly 30. 
// Return false if the condition does not satisfy, otherwise true.
class Que5{
    public static void main(String[] args) {
        int arr[]={10,10,20,34,44};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%10==0){
                sum+=arr[i];
            }
        }
        if(sum==30){
            System.out.println("True");
        }
        else{
            System.out.println("False.");
        }
    }
}