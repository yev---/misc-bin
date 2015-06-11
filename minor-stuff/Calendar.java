public class Calendar 

	{
	public static void main(String[] args){
		
			days();
			line();
			body (3,28); //input date of Sunday and total number of days in month here
			line();
	}
	
	
	
	public static void days(){	
	System.out.printf("%5s%7s%7s%7s%7s%7s%7s",
			"Sun","Mon","Tue","Wed","Thu","Fri","Sat");
	System.out.println();
	}
	
	public static void line(){
	
	for (int i = 1; i <= 7; i++){
	System.out.print("+------");
	}
	System.out.print("+");
	System.out.println();
	}
	
	public static void body(int sun, int month){
	
		if (sun!=1){
		for(int j = 1; j <= ((9-sun) - 1); j++){
			System.out.printf("|  %2s  ", " ");
		}
		}
		
		for(int i = 1; i <= (month); i++){
			System.out.printf("|  %2d  ", i);
            if ((((9-sun) - 1)+i)%7==0){
            	System.out.print("|");
             	System.out.println();
            }
             
		}
		
		if ((((9-sun)-1)+month)<=35){
			for(int j = 1; j <= ((35-(((9-sun)-1)+month))); j++){
				System.out.printf("|  %2s  ", " ");
				}
			System.out.print("|");
			
				
			}

		if ((((9-sun)-1)+month)>35){
			for(int j = 1; j <= ((42-(((9-sun)-1)+month))); j++){
				System.out.printf("|  %2s  ", " ");
				}
			System.out.print("|");
		}
			System.out.println();
	
		}
}

