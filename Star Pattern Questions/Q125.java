//     1
//    123
//   12345
//  1234567
// 123456789

class Q125{
    public static void main(String[] args) {
        int i,j,k,n=5;

        for(i=1;i<=n;i++){

            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(k=1;k<=2*i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
}