import java.util.Scanner;

public class BC {

   public static void print(int row) {
       for (int n = 0; n < row; n++) {
    	   
    	  
    	   for (int l = row - n; l > 0; l--) { 
    	            System.out.print("  "); 
    	   }
           for (int k = 0; k <= n; k++) {  
               System.out.printf("%4d", nCk(n, k));
           }
           
           System.out.println();
       }
   }
   
  
   public static int nCk(int n, int k) {
       int numerator = fact(n);
       int denominator = fact(k) * fact(n - k);
       int result = (int) (numerator / denominator);
       return result;
   }

   public static int fact(int num) {
       int result = 1;
       for (int i = 1; i <= num; i++) {
           result = result * i;
       }
       return result;
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("How many rows tall would you like Pascal's triangle to be? ");
      
       
       int row = scanner.nextInt() + 1;
       //if (row < 1 || (row-1) > 13) 
		//{
		//throw new IllegalArgumentException("There must be at least 1 row and at most 13 rows.");
		//} 
       print(row);
   }
}
