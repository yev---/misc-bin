import java.util.*;

public class RandomWalk {

	public static void main(String[] args){
		
	Random rand = new Random();
	int walk = 1;
	int max = 0;
	
	    while ((walk-1) != 3 && (walk-1) != -3){
	    	int prob = rand.nextInt(101) + 1;
	    	
	    	if (prob<=50){
	    	walk++;	
	    	}
	    	
	    	else {
	    	walk--;	
	    	}
	    	
	    	if (walk > max){
	    		max = walk;
	    	}
	    	
	    	System.out.print("position: " + (walk-1));
	    	System.out.println();
	    	}
	    
	    if ((walk-1) == 3){
	    System.out.println("Max position: " + (walk-1));
	    }
	    
	    else {
	    	System.out.println("Max position: " + (max-1));
	    }
	   
	    
	 }
	 
}
