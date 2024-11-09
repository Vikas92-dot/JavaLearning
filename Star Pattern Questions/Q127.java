//     *
//    *_*
//   *___* 
//  *_____* 
// *********

class Q127{
    public static void main(String[] args) 
    {
        int i,j,n=9;

        for(i=1;i<=n;i+=2)
        {

            for(j=9;j>=i;j--)
            {
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++)
            {
                if (i==k || i==9 ||k==1) 
                {
                    System.out.print(" *");
                }
                else System.out.print(" _");
                
            }
            System.out.println();
        }
    }
}