import java.util.Random;

public class RandomX {

	public static void main(String[] args){
		
	Random rand = new Random();
	   
	    int line = 0;
	    while (line <=16){
	    	int randomNum = rand.nextInt(16) + 5;
	    	line = randomNum;
	    	for (int i = 1; i <= randomNum; i++)
	    		System.out.print("x");
	    		System.out.println();
	    	
	    
	    
	    	}
	    
	 }
	 
}