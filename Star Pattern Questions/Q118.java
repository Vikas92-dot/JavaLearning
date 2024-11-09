// ABCDE
//  ABCD
//   ABC
//    AB
//     A
class Q118{
    public static void main(String[] args) {
        int i,j,n=5;

        for(i=5;i>=1;i--){

            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(char k='A';k<='A'+i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        
    }
    
}