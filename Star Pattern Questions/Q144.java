//    *
//   *_* 
//  *___* 
// *_____*
//  *___* 
//   *_*
//    *

class Q144{
    public static void main(String args[]){
        int i,j,k,n=7;

        for(i=1; i<=n; i+=2)
        {
            for(j=6; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(k=1; k<=i; k++)
            {
                if (i==j || k==1) {
                    System.out.print("*");
                }
                else System.out.print("_");
            }
            System.out.println();
        }
        int temp=5

        for(i=temp; i>=1; i-=2)
        {
            for(j=temp; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(k=1; k<=i; k++)
            {
                if (i==j || k==1) {
                    System.out.print("*");
                }
                else System.out.print("_");
            }
            System.out.println();
        }
    }
    
}