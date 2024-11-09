// 123456789
//  1     7
//   1   5
//    1 3
//     1


class Q137{
    public static void main(String[] args) {
        int i,j,k;

        for(i=9;i>=1;i-=2)
        {
            for(j=9;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                if(i==k || i==9 || k==1)
                {
                System.out.print(k+" ");
                }
                else System.out.print("+ ");
            }
            
            System.out.println();
        }
    }
    
}