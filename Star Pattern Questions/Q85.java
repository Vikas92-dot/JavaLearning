//a
//bc
//d f
//g  j
//klmno



class Q85{
    public static void main(String[] args) {
        
        for(char i='a';i<='o';i++){
            for(char j='a';j<=i;j++){
                if (j=='a' || i=='o' ||i==j) { 
                    System.out.print(i);
                
                }
                else System.out.print(" ");
            }
            
            System.out.println();
        }
        
    }
    
}
