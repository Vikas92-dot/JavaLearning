//1
//22
//3 3
//4  4
//55555


class Q83{
    public static void main(String[] args) {
        int i,j,n=5,k=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if (i==j || i==n ||j==k) {
                    System.out.print(i);
                
                }
                else System.out.print(" ");
            }
            
            System.out.println();
        }
        
    }
    
}
