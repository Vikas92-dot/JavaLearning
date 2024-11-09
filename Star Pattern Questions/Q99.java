// ABCDE
// A  D
// A C
// AB
// A


class Q99{
    public static void main(String[] args) {
        int i,j;
        for(i=69;i>=65;i--){
            for(j=65;j<=i;j++){
                if (j==i || j==65 || i==69) {
                    System.out.print((char)j);
                    }
                else System.out.print(" ");
                
            }
            System.out.print("\n");
        }
    }
    
}