import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        int difference = height+1;
        
        for (int line = height; line >= 1; line--) {
            for (int i = 1; i <= (line - 1); i++) {
            System.out.print(" ");
            }
             
            for (int i = 1; i <= (difference-line); i++) {
            System.out.print("#");
            }
            System.out.println();

       }
        
    }
}