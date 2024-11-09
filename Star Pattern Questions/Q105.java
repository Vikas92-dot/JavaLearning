// 54321
// 5432
// 543
// 54
// 5

class Q105{
    public static void main(String[] args) {
        int i,j,n=5;

        for(i=1;i<=5;i++){
            for(j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}