import java.util.*;

public class Sides {
	
	
public static void main(String[] args) {
	
	
		
		Scanner console = new Scanner(System.in);
		intro();
	
		System.out.print("Length of side A? ");
		double A = (console.nextDouble());
		
		
		System.out.print("Length of side B? ");
		double B = (console.nextDouble());
		
		
		System.out.print("Length of side C? ");
		double C = (console.nextDouble());
		
		double a1 = (Math.acos(((B*B)+(C*C)-(A*A))/(2*B*C)));
		double b1 = (Math.acos(((A*A)+(C*C)-(B*B))/(2*A*C)));
		double c1 = (180-Math.toDegrees(a1)-Math.toDegrees(b1));
		System.out.println();
		System.out.println("Angle a :" + Math.round(Math.toDegrees(a1))+ "°");
		System.out.println("Angle b :" + Math.round(Math.toDegrees(b1))+ "°");
		System.out.println("Angle c :" + Math.round(c1)+ "°");
		

}

public static void intro(){
	System.out.println("This program computes the three");
	System.out.println("corresponding angles of any triangle");
	System.out.println("given the lengths of all three sides");
	System.out.println();

}
}