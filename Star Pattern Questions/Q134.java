// 123456789
//  1234567
//   12345
//    123
//     1
class Q134{
    public static void main(String[] args) {
        int i,j,k,n=9;

        for(i=9;i>=1;i-=2)
        {
            for(j=9;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(k );
            }
            System.out.println();
        }
    }
    
}