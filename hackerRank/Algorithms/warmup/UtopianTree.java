import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int cases = input.nextInt();
       
       while (input.hasNextInt()){
       int cycles = input.nextInt();
       int height = 1;
        for (int i = 1; i <= cycles; i++){
            if (i%2==0){
                height = height + 1;
                
            }else {
                height = height+height;
            }
            
            
        }
           System.out.println(height);
       }
    }
}