//1.Write a Java program to sort a numeric array and a string array.
class Sorting{
    public static void main(String args[]){
        int arr[]={9,4,1,25,3,7};
        String brr[]={"vikas","daksh","shivam","sumit","vipin"};

        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        String demo;
        for(int a=0; a<brr.length; a++){
            
            for(int b=a+1; b<brr.length; b++){
                
                if(brr[a].compareTo(brr[b])>0){
                    demo=brr[a];
                    brr[a]=brr[b];
                    brr[b]=demo;

                }
            }
        }
        String s="vikas";

        char ch[]=s.toCharArray();
        char tt=' ';
        for(int x=0; x<ch.length; x++){
            for(int y=x+1; y<ch.length; y++){
                if(ch[x]>ch[y]){
                    tt=ch[x];
                    ch[x]=ch[y];
                    ch[y]=tt;
                }
            }
        }

        System.out.println("Sorting Number Array:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Sorting String Array:");
        for(int a=0; a<brr.length; a++){
            System.out.print(brr[a]+" ");
        }
        System.out.println();
        System.out.println("Sorting Character Array:");
        for(int x=0; x<ch.length; x++){
            System.out.print(ch[x]+" ");
        }
    }
}