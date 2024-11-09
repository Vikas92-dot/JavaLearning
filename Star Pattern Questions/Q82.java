//1
//12
//1 3
//1  4
//12345

class Q82{
    public static void main(String[] args) {
        int i,j,n=5,k=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if (i==j || i==n ||j==k) {
                    System.out.print(j);
                
                }
                else System.out.print(" ");
            }
            
            System.out.println();
        }
        
    }
    
}
