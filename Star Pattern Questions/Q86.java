//*
//**
//*@*
//*@@*
//* * * * *
class Q86{
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                if (i==j || i==5 ||j==1) {
                    System.out.print("*");
                
                }
                else System.out.print("@");
            }
            
            System.out.println();
        }
        
    }
    
}
