import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // input - don't change this code
      Scanner scn = new Scanner(System.in);
      int marks = scn.nextInt();
      // input - don't change this code
      
      // code here  
      gradingsystem(marks);
      }
      
      public static void gradingsystem(int n)
      {
          if(n>90){
              System.out.println("excellent");
          }else if(n>80 && n<=90){
              System.out.println("good");
          }else if(n>70 && n<=80){
              System.out.println("fair");
          }else if(n>60 && n<=70){
              System.out.println("meets expectations");
          }else{
              System.out.println("below par");
          }
      }
  
   }
  