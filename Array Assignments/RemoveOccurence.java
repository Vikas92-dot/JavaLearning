//Given an array and a key, the task is to remove all occurrences of the specified key from the array in Java. Examples:

// Input: array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 }, key = 3
// Output: [9, 2, 1, 7, 2, 5]
public class RemoveOccurence {
    public static void main(String[] args) {
        int arr[]={ 3, 9, 2, 3, 1, 7, 2, 3, 5 };
        int key=3;int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                for(int j=i; j<arr.length-1; j++){
                    arr[j]=arr[j+1];
                }
                count++;
            }
        }
        System.out.print("[");
        for(int i=0; i<arr.length-count; i++){
            System.out.print(arr[i]+",");
        }
        System.out.print("]");
    }
}
