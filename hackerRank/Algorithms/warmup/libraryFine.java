import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day1 = input.nextInt();
        int month1 = input.nextInt();
        int year1 = input.nextInt();
        int day2 = input.nextInt();
        int month2 = input.nextInt();
        int year2 = input.nextInt();
        
        if (day1<=day2 && month1==month2 && year1==year2){
            System.out.println(0);
        }else if (month1<month2 && year1==year2 ){
            System.out.println(0);
        }else if (year1<year2){
            System.out.println(0);
        }
        else if (day1==day2 && month1==month2 && year1==year2){
            System.out.println(0);
        }else if (month1==month2 && year1==year2){
            System.out.println((day1-day2) * 15);
        }else if (year1==year2){
            System.out.println((month1-month2) * 500);
        }else {
            System.out.println(10000);
        }
    }
}