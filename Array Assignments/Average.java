class Average{
    public static void main(String args[]){
        int arr[]={4,5,1,2,78,16,45,36};
        double avg=1;
        int n=arr.length;
        double sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        avg=sum/n;
        System.out.println("Sum of Array: "+sum+"\nAverage: "+avg);
    }
}