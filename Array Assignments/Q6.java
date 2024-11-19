//Q.6 Sort the array of 0s , 1s and 2s.
class Q6{
    public static void main(String args[]){
       java.util.Scanner sc=new java.util.Scanner(System.in);
       System.out.println("Enter the length of Array");
       int length=sc.nextInt();
    
       int arr[]=new int[length];

       for(int i=0; i<arr.length; i++){
        System.out.println("Enter Elements at "+(i+1)+":");
        arr[i]=sc.nextInt();
       }
       System.out.println("OutPut: ");
       int temp=0;
       for(int i=0; i<arr.length; i++){
        if (arr[i]==temp) {
            System.out.print(arr[i]+" ");
        }
       }
       int temp1=1;
       for(int i=0; i<arr.length; i++){
        if (arr[i]==temp1) {
            System.out.print(arr[i]+" ");
        }
       }
       int temp2=2;
       for(int i=0; i<arr.length; i++){
        if (arr[i]==temp2) {
            System.out.print(arr[i]+" ");
        }
       }


    }
}