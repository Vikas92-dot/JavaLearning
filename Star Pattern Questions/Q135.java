// A B C D E
//  A B C D
//   A B C
//    A B
//     A

class Q135{
    public static void main(String[] args) {
        char i,j,k;

        for(i='E';i>='A';i--)
        {
            for(j='E';j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k='A';k<=i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    
}