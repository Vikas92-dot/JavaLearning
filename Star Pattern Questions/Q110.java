//     A
//    AB
//   ABC
//  ABCD
// ABCDE
class Q110{
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=1;i<=5;i++){
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