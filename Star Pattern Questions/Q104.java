// A
// BCD
// EFGHI
// JKLMNOP


class Q104{
    public static void main(String[] args) {
        int i,j,counter=65;

        for(i=1;i<=4;i++){
            for(j=1;j<=i;j++){
                System.out.print((char)counter);
                counter++;
            }
            
            System.out.println();
        }
        
    }
    
}