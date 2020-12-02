import java.util.Scanner;
  
  public class Main{
      
  public static Scanner scn = new Scanner(System.in);
  
  public static void CountDigit(int n){
      int ctr=0;
      while(n>0)
      {
          int res;
          res = n%10;
          ctr++;
          n = n/10;
      }
      System.out.println(ctr);
  }
  
  public static void main(String[] args) {
    // write your code here  
    int n = scn.nextInt();
    CountDigit(n);
   }
  }