// 55555
// 4  4
// 3 3
// 22
// 1


class Q101{
    public static void main(String[] args) {
        int i,j;
        for(i=5;i>=1;i--){
            for(j=1;j<=5;j++){
                if (i==j || i==5 || j==1) {
                    System.out.print(i);
                    }
                else System.out.print(" ");
                
            }
            System.out.print("\n");
        }
    }
    
}