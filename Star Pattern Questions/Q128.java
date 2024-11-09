//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1

class Q128{
    public static void main(String[] args) {
        int i,j,k,n=5;

        for(i=1;i<=n;i++){

            for(j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(k=1;k<=i;k++){
                if (i==k || i==5 || k==1) {
                    System.out.print("1 );
                }
                else System.out.print(k);
                

            }
            
            System.out.println();
        }
    }
    
}