//     1
//    12
//   123
//  1234
// 12345

class Q106{
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=5;i++){
            for(j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){ 
                System.out.print(k);
            }
            System.out.println();
        }
        
    }
    
}