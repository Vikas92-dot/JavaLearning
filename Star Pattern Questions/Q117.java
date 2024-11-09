// ABCDE
//  A__D
//   A_C
//    AB
//     A
class Q117{
    public static void main(String[] args) {
        
        for(char i='E';i>='A';i--)
        {
            for(char j='E';j>=i;j--)
            {
                System.out.print(" ");
            }
            for(char k='A';k<=i;k++)
            {
                if (i==k || i=='E' || k=='A') 
                {
                    System.out.print(k);
                }
                else System.out.print("_");
            }
            System.out.println();
        }

        
        }
    }
    
