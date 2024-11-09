// 11111
//  2222
//   333
//    44
//     5

class Q119{
    public static void main(String[] args) {
        int i,j,k,n=5,tem=1;

        for(i=5;i>=1;i--){

            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(k=1;k<=i;k++){
                System.out.print(tem);
            }
            tem++;
            
            System.out.println();
        }
    }
    
}