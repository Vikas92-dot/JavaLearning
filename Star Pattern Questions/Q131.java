//     #
//    *#* 
//   **#** 
//  ***#*** 
// ****#****

class Q131{
    public static void main(String[] args) {
        int i,j,k,n=5;

        for(i=1;i<=n;i++)
        {
            for(j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++)
            {
                if (k==i) 
                {
                    System.out.print("#");
                }
                else System.out.print("*");

            }
            System.out.println();
        }
    }

    
}