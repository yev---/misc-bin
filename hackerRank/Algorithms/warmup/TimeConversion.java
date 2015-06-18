import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       input.useDelimiter(":");
       int hours = input.nextInt();
       String minutes = input.next();
       String seconds = input.next();
       
       if (seconds.substring(2).equals("PM")&& hours!=12){
           System.out.println((hours+12)+":" + minutes+ ":" + seconds.substring(0,2));
       }else if (seconds.substring(2).equals("AM")&& hours==12) {
           System.out.println("00"+":" + minutes+ ":" + seconds.substring(0,2));
       }else if (seconds.substring(2).equals("PM")&& hours==12) {
           System.out.println(12+":" + minutes+ ":" + seconds.substring(0,2));
       }else if (seconds.substring(2).equals("AM")) {
           System.out.println("0" + hours +":" + minutes+ ":" + seconds.substring(0,2));  
       }else{
          System.out.println((hours)+":"+minutes+ ":" + seconds.substring(0,2)); 
       }
       
       
    }
}