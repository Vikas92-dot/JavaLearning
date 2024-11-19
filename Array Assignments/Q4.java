//Q.4 Write a program to sort the array.
class Q4{
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        int n=arr.length-1;

        for(int i=0; i<=n; i++){
            for(int j=i+1; j<=n; j++){
                if (arr[i]>=arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
            }
        }

        System.out.println("Sorting Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }

    }
}