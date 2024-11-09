// 12345
//  1234
//   123
//    12
//     1
class Q113{
    public static void main(String[] args) {
        int i,j,k,n=5;

        for(i=5;i>=1;i--){

            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
}