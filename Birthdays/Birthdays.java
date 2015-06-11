import java.util.*;

public class Birthdays {
	
	public static void main(String[] args)
		{
		intro();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first individual's date:");
		System.out.println();
		int person1 = days(m1(getmonth(monthInfo(input))), date(input));
		System.out.println();
		System.out.println("Enter the second individual's date:");
		System.out.println();
		int person2 = days(m1(getmonth(monthInfo(input))), date(input));
		System.out.println();
		System.out.println("Enter today's date:");
		System.out.println();
		int today = days(m1(getmonth(monthInfo(input))), date(input));
		int person1s = dateTill1(person1, today);
		int person2s = dateTill1(person2, today);
		System.out.println();
		System.out.println(person1s + " days remain until the first individual's birthday.");
		System.out.println();
		System.out.println(person2s + " days remain until the second individual's birthday.");
		System.out.println();
		String closer = sooner2(sooner(person1s, person2s));
		System.out.print(closer + " individual's birthday is sooner.");
		}
	
		public static void intro(){
			System.out.println("Given the month and date of birth of two individuals\n"
					+ "and the current month and date, this program determins\n"
					+ "how many days remain until each individual's birthday\n"
					+ "and which birthday is sooner.");
			System.out.println();;	
		}
		
		public static int dateTill1(int person1, int today)
		{
			if (person1 > today)
				return (person1 - today);
			else 
				return ((365-today) + person1);	
		}
		
		public static int dateTill2(int person2, int today)
		{
			if (person2 > today)
				return (person2 - today);
			else 
				return ((365-today) + person2);	
		}
		
		public static int sooner(int person1s, int person2s){
			if (person1s < person2s)
				return 1;
			else return 2; 	
		}
		
		public static String sooner2(int sooner){
			
			if (sooner == 1)
			
			 return "First";
			else return "Second";
			
		}

		public static String monthInfo(Scanner input)
		{
			
		System.out.print("Month? ");
		String month = input.next();
		return month;
		}
	
		public static String getmonth(String month) {
		if ((month .equalsIgnoreCase("January") != true) && (month .equalsIgnoreCase("February") != true)
				&& (month .equalsIgnoreCase("March") != true) && (month .equalsIgnoreCase("April") != true)
				&& (month .equalsIgnoreCase("May") != true) && (month .equalsIgnoreCase("June") != true)
				&& (month .equalsIgnoreCase("July") != true) && (month .equalsIgnoreCase("August") != true)
				&& (month .equalsIgnoreCase("September") != true) && (month .equalsIgnoreCase("October") != true)
				&& (month .equalsIgnoreCase("November") != true) && (month .equalsIgnoreCase("December") != true))
			{
			throw new IllegalArgumentException("Month: " + month);
			}
		
		return month;
		}
		
		public static int date(Scanner input)
		{	
		System.out.print("Day? ");
		int date = input.nextInt();
		
		if (date < 1 || date > 31 )
			{
			throw new IllegalArgumentException("Day: " + date);
			}
		
		return date;
		}
		
		public static int days(int m1, int date){
			int dayTotal= m1 + date;
			
			return dayTotal;	
		}
		
		public static int m1(String getmonth) {

			int jan = Integer.parseInt("0");
			int feb = Integer.parseInt("31");
			int mar = Integer.parseInt("59");
			int apr = Integer.parseInt("90");
			int may = Integer.parseInt("120");
			int jun = Integer.parseInt("151");
			int jul = Integer.parseInt("181");
			int aug = Integer.parseInt("212");
			int sep = Integer.parseInt("243");
			int oct = Integer.parseInt("273");
			int nov = Integer.parseInt("304");
			int dec = Integer.parseInt("334");
			
			if (getmonth .equalsIgnoreCase("January"))
				{
				 return jan;	
				}
			else if (getmonth .equalsIgnoreCase("February"))
				{
			return(feb);
				}
			else if (getmonth .equalsIgnoreCase("March"))
			{
				return(mar);
			}
			else if (getmonth .equalsIgnoreCase("April"))
			{
				return(apr);
			}
			else if (getmonth .equalsIgnoreCase("May"))
			{
				return(may);
			}
			else if (getmonth .equalsIgnoreCase("June"))
			{
				return(jun);
			}
			else if (getmonth .equalsIgnoreCase("July"))
			{
				return(jul);
			}
			else if (getmonth .equalsIgnoreCase("August"))
			{
				return(aug);
			}
			else if (getmonth .equalsIgnoreCase("September"))
			{
				return(sep);
			}
			else if (getmonth .equalsIgnoreCase("October"))
			{
				return(oct);
			}
			else if (getmonth .equalsIgnoreCase("November"))
			{
				return(nov);
			}
			else 
				return dec;
		   
		}
	
}
