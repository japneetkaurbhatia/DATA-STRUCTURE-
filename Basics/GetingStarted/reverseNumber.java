import java.util.*;
   
   public class Main{
   public static Scanner scn = new Scanner(System.in);
   public static void reverseNumber(int n){
       //int len = countDigit(n);
       int rem = 0;
       while(n>0){
           rem = n % 10;
           System.out.println(rem);
           n /= 10;
       }
   }
   public static void main(String[] args) {
     // write your code here  
     int n = scn.nextInt();
     reverseNumber(n);
    }
   }