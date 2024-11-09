//     X 
//    X X 
//   X__X
//  X____X
// X X X X X
 


class Q123{
    public static void main(String[] args) {
        int i,j,n=5;

        for(i=1;i<=n;i++){

            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                if (i==k || i==5 ||k==1) {
                    System.out.print("X");
                }
                else System.out.print("_");
                
            }
            System.out.println();
        }
    }
}