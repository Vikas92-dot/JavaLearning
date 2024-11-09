//     A
//    A B
//   A B C
//  A B C D
// A B C D E  


class Q122{
    public static void main(String[] args) {
        int i,j,n=5;

        for(i=1;i<=n;i++){

            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(char k='A';k<='A'+i-1;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}