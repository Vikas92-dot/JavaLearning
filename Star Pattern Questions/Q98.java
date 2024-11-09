// *****
// *  *
// * *
// **
// *

class Q98{
    public static void main(String[] args) {
        int i,j;
        for(i=5;i>=1;i--){
            for(j=1;j<=i;j++){
                if (j==i || j==1 || i==5) {
                    System.out.print("*");
                    }
                else System.out.print(" ");
                
            }
            System.out.print("\n");
        }
    }
    
}