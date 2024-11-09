//     1
//    11
//   1*1
//  1**1
// 11111

class Q109{
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=1;i<=5;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if (i==k || i==5 || k==1) {
                    System.out.print("1");
                }
                else System.out.print("*");
                
            }
            
            System.out.println();
        }
        
    }
    
}