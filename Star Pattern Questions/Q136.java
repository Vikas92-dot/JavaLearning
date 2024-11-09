// 5 5 5 5 5
//  4 4 4 4
//   3 3 3
//    2 2
//     1


class Q136{
    public static void main(String[] args) {
        int i,j,k;

        for(i=5;i>=1;i--)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}