// 55555
//  4444
//   333
//    22
//     1

class Q114{
    public static void main(String[] args) {
        int i,j,k,n=5;

        for(i=5;i>=1;i--){

            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(k=1;k<=i;k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}