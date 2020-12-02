import java.util.*;
   
   public class Main{
       
   public static Scanner scn = new Scanner(System.in);
   
   public static void RevNum(int n){
       int num = n;
       while(num>0){
           int res = num%10;
           System.out.println(res);
           num /= 10;
       }
   }
   
   public static void main(String[] args) {
     // write your code here  
     int n = scn.nextInt();
     RevNum(n);
    }
   }