//Q3.Write a Java program to find common elements in three sorted (in non-decreasing order) arrays.
class Que3{
  public static void main(String[] args) {
    int arr[]={1,2,3,7};
    int brr[]={3,6,7};
    int crr[]={3,8,7,11,12};

    boolean flag=false;
    for(int i=0; i<arr.length; i++){
        int temp=0; 
        for(int j=0; j<brr.length; j++){
            if(arr[i]==brr[j]){
                temp=arr[i];
                for(int k=0; k<crr.length; k++){
                    if(crr[k]==temp){
                        System.out.print(crr[k]+" ");
                        flag=true;
                    }
                
                }
            }
        }
    }
    if(flag){
        System.out.println("Common element find successfully");
    }
    else{
        System.out.println("No common element find");
    }
  }  
}