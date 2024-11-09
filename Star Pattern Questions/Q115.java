// 12345
//  1__4
//   1_3
//    12
//     1
class Q115{
    public static void main(String[] args) {
        int i,j,k,n=5;

        for(i=5;i>=1;i--){

            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(k=1;k<=i;k++){
                if (i==k || i==5 || k==1) {
                    System.out.print(k);
                    }
                else System.out.print("_");
            }
            System.out.println();
        }
    }
    
}