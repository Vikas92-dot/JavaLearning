// 5
// 54
// 543
// 5432
// 54321

class Q87{
    public static void main(String[] args) {
        
                int n = 5; // Number of rows
        
                // Outer loop for rows
                for (int i = 5; i >= 1; i--) {
                    // Inner loop for printing numbers
                    for (int j = n; j >= i; j--) {
                        System.out.print(j);
                    }
                    System.out.println(); // Move to the next line after printing each row
                }
            }
        }
        
    
    
