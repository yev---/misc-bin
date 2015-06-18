import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        
        for (int k = 0; k<size; k++)
        {  
            for (int m = 0; m<size; m++){            
              matrix[k][m]=input.nextInt();
            }         
        }
        
      int firstSum = 0; 
      for (int i = 0; i < size; i ++)  {
          firstSum = firstSum + matrix[i][i];    
      }
      int secondSum = 0;
      for (int j = 0; j < size; j++){
          secondSum = secondSum + matrix[j][(size-1)-j];
            
      }
        
      
     System.out.println(Math.abs(firstSum - secondSum));
        
        
    }    
      
        

    
}