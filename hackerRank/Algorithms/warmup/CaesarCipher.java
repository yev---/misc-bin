import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    public static int toNumber(char letter){
    	
        if (letter=='a' || letter=='A'){
            return 1;
        } else if (letter=='b' || letter=='B' ){
            return 2;
        } else if (letter=='c' || letter=='C'){
            return 3;
        } else if (letter=='d' || letter=='D'){
            return 4;
        } else if (letter=='e' || letter=='E'){
            return 5;
        } else if (letter=='f' || letter=='F'){
            return 6;
        } else if (letter=='g' || letter=='G'){
            return 7;
        } else if (letter=='h' || letter=='H'){
            return 8;
        } else if (letter=='i' || letter=='I'){
            return 9;
        } else if (letter=='j' || letter=='J'){
            return 10;
        } else if (letter=='k' || letter=='K'){
            return 11;
        } else if (letter=='l' || letter=='L'){
            return 12;
        } else if (letter=='m' || letter=='M'){
            return 13;
        } else if (letter=='n' || letter=='N'){
            return 14;
        } else if (letter=='o' || letter=='O'){
            return 15;
        } else if (letter=='p' || letter=='P'){
            return 16;
        } else if (letter=='q' || letter=='Q'){
            return 17;
        } else if (letter=='r' || letter=='R'){
            return 18;
        } else if (letter=='s' || letter=='S'){
            return 19;
        } else if (letter=='t' || letter=='T'){
            return 20;
        } else if (letter=='u' || letter=='U'){
            return 21;
        } else if (letter=='v' || letter=='V'){
            return 22;
        } else if (letter=='w' || letter=='W'){
            return 23;
        } else if (letter=='x' || letter=='X'){
            return 24;
        } else if (letter=='y' || letter=='Y'){
            return 25;
        } else {
            return 26;
        }
    }
    
    
    
    public static char toLetter(int number){
    	if (number==1){
            return 'a';
        } else if (number==2){
            return 'b';
        } else if (number==3){
            return 'c';
        } else if (number==4){
            return 'd';
        } else if (number==5){
            return 'e';
        } else if (number==6){
            return 'f';
        } else if (number==7){
            return 'g';
        } else if (number==8){
            return 'h';
        } else if (number==9){
            return 'i';
        } else if (number==10){
            return 'j';
        } else if (number==11){
            return 'k';
        } else if (number==12){
            return 'l';
        } else if (number==13){
            return 'm';
        } else if (number==14){
            return 'n';
        } else if (number==15){
            return 'o';
        } else if (number==16){
            return 'p';
        } else if (number==17){
            return 'q';
        } else if (number==18){
            return 'r';
        } else if (number==19){
            return 's';
        } else if (number==20){
            return 't';
        } else if (number==21){
            return 'u';
        } else if (number==22){
            return 'v';
        } else if (number==23){
            return 'w';
        } else if (number==24){
            return 'x';
        } else if (number==25){
            return 'y';
        } else {
            return 'z';
        }
    	
    }
    
   
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        String raw = input.next();
        int n = input.nextInt();
        StringBuilder newWorld = new StringBuilder();
        for (int i = 0; i <= length-1; i ++){
        	
        if (raw.charAt(i) >= 'a' && raw.charAt(i) <= 'z'){
           int k = toNumber(raw.charAt(i));
           int cipher = (k+n) % 26; 
           char newLetter = toLetter(cipher);
           
           newWorld.append(newLetter);
        	}else if (!Character.isLetter(raw.charAt(i))) {
        		newWorld.append(raw.charAt(i));
        	}
        
        if (raw.charAt(i) >= 'A' && raw.charAt(i) <= 'Z'){
        	int k = toNumber(raw.charAt(i));
            int cipher = (k+n) % 26; 
            char newLetter = toLetter(cipher);
            char nLUpper = Character.toUpperCase(newLetter);
            newWorld.append(nLUpper);    	
        }      
        }
        
        System.out.println(newWorld);
    }

  
}