// *****
// ####
// ***
// ##
// *



class Q100{
    public static void main(String[] args) {
        int i,j;
        for(i=5;i>=1;i--){
            for(j=1;j<=i;j++){
                if (i%2!=0) {
                    System.out.print("*");
                    }
                else System.out.print("#");
                
            }
            System.out.print("\n");
        }
    }
    
}