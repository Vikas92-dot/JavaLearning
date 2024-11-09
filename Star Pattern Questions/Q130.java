//     A
//    B B
//   C  C
//  D    D
// EEEEEEEEE
class Q130{
    public static void main(String[] args) {
        

        for(char i='A';i<='E';i++)
        {
            for(char j='E';j>='A';j--)
            {
                System.out.print(" ");
            }
            for(char k='A';k<=i;k++)
            {
                if (i==k || i=='E' || k=='A') 
                {
                 System.out.print(i+" ");   
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}