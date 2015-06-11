import java.util.*;

public class Twos {

	public static void main(String[] args){
		
		System.out.println("num? ");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		System.out.print(i + " = ");
		while (i%2==0){
			System.out.print("2 * ");
			i= i/2;
		}
		System.out.print(i);
		System.out.println();
		
	}
}