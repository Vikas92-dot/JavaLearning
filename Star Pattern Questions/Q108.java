//     5
//    44
//   333
//  2222
// 11111


class Q108{
    public static void main(String[] args) {
        int i,j,k,n=5;
        for(i=1;i<=5;i++){
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