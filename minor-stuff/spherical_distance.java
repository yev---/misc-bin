import java.util.*;

public class Distance {
	
	//radius of the earth
		public static final double RADIUS = 6372.795;
	
public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		intro();
		
	
		System.out.print("First City latitude? ");
		double latitude1 = Math.toRadians(console.nextDouble());
		double a1 = Math.sin(latitude1);
		double b1 = Math.cos(latitude1);
		
		System.out.print("First City Longitude? ");
		double longitude1 = Math.toRadians(console.nextDouble());
		
		System.out.print("Second City Latitude? ");
		double latitude2 = Math.toRadians(console.nextDouble());
		double a2 = Math.sin(latitude2);
		double b2 = Math.cos(latitude2);
		System.out.print("Second City Longitude? ");
		double longitude2 = Math.toRadians(console.nextDouble());
		double c1 = Math.cos(longitude2-longitude1);
		double result1 = ((a1*a2)+(b1*b2*c1));
		double result2 = Math.acos(result1);
		System.out.print(RADIUS*result2+" km");

}

		public static void intro(){
			System.out.println("This program computes the");
			System.out.println("spherical distance between");
			System.out.println("any two cities on Earth.");
			System.out.println();

}
}
