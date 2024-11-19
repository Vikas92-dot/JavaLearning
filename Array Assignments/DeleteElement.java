class DeleteElement{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int delete=10;
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==delete){
                for(int j=i; j<arr.length-1; j++){
                    arr[j]=arr[j+1];
                }
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found successfully");
            for(int i=0; i<arr.length-1; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}