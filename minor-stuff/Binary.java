import java.util.*;

public class Binary {

	public static void main(String[] args){
		
			System.out.print("Enter a number: ");
			Scanner input = new Scanner(System.in);
			int decimal = input.nextInt();
		    
		    System.out.println("The binary representation of " + decimal +" is " + toBinary(decimal) + ".");
	}
			public static String toBinary(int decimal){
			String binary = "";
			while (decimal>0){
				int rem = decimal%2;
				binary = rem + binary;
				decimal= decimal/2;
			}
			return binary;
			
			}	
	}	
