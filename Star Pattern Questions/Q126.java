//     A
//    ABC
//   ABCDE
//  ABCDEEF
// ABCDEFGHI


class Q126{
    public static void main(String[] args) {
        
        for(char i='A';i<='I';i+=2)
        {
            for(char j='I';j>=i;j--)
            {
                System.out.print(" ");
            }
            for(char k='A';k<=i;k++)
            {
                System.out.print(" "+k);
            }
            System.out.println();
        }
    }

}