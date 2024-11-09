//    *
//   ***
//  ***** 
// ******* 
//  ***** 
//   *** 
//    *
class Q143{
    public static void main(String args[]){
        int i,j,k,n=7;

        for(i=1; i<=n; i+=2)
        {
            for(j=n; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(k=1; k<=i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        int temp=5;

        for(i=temp; i>=1; i-=2)
        {
            for(j=temp; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(k=1; k<=i; k++)
            {
                System.out.print(" *");
            }
            System.out.println();
    }
    
}
}