public class PrimeNo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,7,9,11,57,343,341};
        

        for(int i=0; i<arr.length; i++){
            boolean flag=true;
            int n=arr[i];

            for(int j=2; j<=(n/2); j++){
                if(n%j==0){
                 flag=false;
                 break;
                }
            }
            if(flag){
                System.out.print(n+" ");
            }
        }
    }
}
