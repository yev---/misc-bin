import java.util.Scanner;

public class GCD {

public static void main(String[] args){
		
		System.out.println("This program computes the");
		System.out.println("greatest common divisor of");
		System.out.println("any two numbers.");
		System.out.print("First number? ");
		Scanner a = new Scanner(System.in);
		int a1 = a.nextInt();
		System.out.print("Second number? ");
		Scanner b = new Scanner(System.in);
		int b1 = b.nextInt();
	
		while(a1!=0 && b1!=0) 
		  {
		     int c = b1;
		     b1 = a1%b1;
		     a1 = c;
		  }
		System.out.println();
		System.out.print("The greatest common divisor is ");
		System.out.print(a1+b1); 
		System.out.println();
		}
}