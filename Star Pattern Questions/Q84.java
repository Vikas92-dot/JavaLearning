//A
//AB
//A C
//A  D
//ABCDE



class Q84{
    public static void main(String[] args) {
        
        for(char i='A';i<='E';i++){
            for(char j='A';j<=i;j++){
                if (j=='A' || i=='E' ||i==j) { 
                    System.out.print(j);
                
                }
                else System.out.print(" ");
            }
            
            System.out.println();
        }
        
    }
    
}
