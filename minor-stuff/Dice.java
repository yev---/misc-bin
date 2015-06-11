import java.util.*;


	public class Dice {

		public static void main(String[] args){
			
		Random rand = new Random();
		Scanner input = new Scanner(System.in); 
		System.out.print("Desired dice sum? ");
		int sum2 = input.nextInt();  
		int sum = 0;
		int count = 0;
		    while (sum != sum2){
		    	int dice1 = rand.nextInt(6) + 1;
		    	int dice2 = rand.nextInt(6) + 1;
		    	sum = dice1 + dice2;
		    	count++;
		    	System.out.print(dice1 + " and " + dice2 + " = " + sum );
		    	System.out.println();
		    	
		    	}
		    System.out.println("Total dice rolls: " + count);
		    
		    
		 }
		 
}