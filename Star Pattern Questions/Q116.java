// 55555
// 4__4
// 3_3
// 22
// 1

class Q116{
    public static void main(String[] args) {
        int i,j,k,n=5;

        for(i=5;i>=1;i--){

            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(k=1;k<=i;k++){
                if (i==k || i==5 || k==1) {
                    System.out.print(i);
                    }
                else System.out.print("_");
            }
            System.out.println();
        }
    }
    
}