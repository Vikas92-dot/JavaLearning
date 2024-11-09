//     1
//    10
//   101
//  1010
// 10101

class Q112{
    public static void main(String[] args) {
        int i,j,k,n=5;

        for(i=1;i<=5;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
               
                System.out.print(k%2);
            }
            System.out.println();
        }
    }
    
}