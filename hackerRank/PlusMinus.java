import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i<size;i++){
            arr[i]=input.nextInt();
        }
        
        double pos = 0;
        double neg = 0; 
        double zer = 0; 
        
        for (int k = 0; k<size;k++){
            if (arr[k]<0){
                neg++;
            }else if (arr[k]>0){
                pos++;
            }else{
                zer++;
            }
        }
      
        double positive = (pos/size);
        double negative = (neg/size);
        double zero = (zer/size);
        
      
       DecimalFormat numberFormat = new DecimalFormat("#.000");
       System.out.println(numberFormat.format(positive));
       System.out.println(numberFormat.format(negative));
       System.out.println(numberFormat.format(zero));
    }
}