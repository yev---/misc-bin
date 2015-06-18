import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        do {
            int n = input.nextInt();
            int k = input.nextInt();
            int[] student = new int[n];
            for (int j = 0; j <=n-1;j++){
            	student[j]=input.nextInt();
            }
            
            int late = 0;
            for (int m = 0; m<=n-1;m++){
            	if (student[m]>0){
            		late++;
            	}	 
            }
            
         int notLate = n-late;
         
            if (notLate<k) {
            	System.out.println("YES");
            
            }if (notLate>=k) {
            	System.out.println("NO");
            	
            }       
         cases--;
         }while (cases!=0); 
        }    
    }