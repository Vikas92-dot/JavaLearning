//     1
//    1*1
//   1***1
//  1*****1
// 111111111
class Q129{
    public static void main(String[] args) {
        int i,j,k,n=9;

        for(i=1;i<=n;i+=2)
        {
            
            for(j=9;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                if (i==k || i==9 || k==1) 
                {
                    System.out.print(" 1");                    
                }
                else System.out.print(" *");
            }
            System.out.println();
        }
    }
    
}