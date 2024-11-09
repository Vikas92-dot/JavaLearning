// 1
// 1 2
// 1  3
// 1   4
// 1  3
// 1 2
// 1


class Q141{
    public static void main(String args[]){
        int i,j;

        for(i=1; i<=4; i++)
        {
            for(j=1; j<=i; j++)
            {
                if(i==j || j==1)
                {
                  System.out.print(j);
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
        for(i=3; i>=1; i--)
        {
            for(j=1; j<=i; j++)
            {
                if(i==j || j==1)
                {
                  System.out.print(j);
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}