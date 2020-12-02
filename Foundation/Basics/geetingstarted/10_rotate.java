import java.util.*;
   
   public class Main{
    public static Scanner scn= new Scanner(System.in);
    public static int countDigit(int n){
    int count = 0;
    int num=n;
    while(num!=0){
        num=num/10;
        count++;
    }
    return count;
}
public static int rotateNumber(int n,int r){
    int len=countDigit(n);
    r%=len;
    if(r<0) 
    r=(r+len) % len;
    
    int mul =1,div=1;
    for(int i=1;i<=len;i++){
        if(i<=r)
        div *=10;
        else mul *=10;
    }
    int A=n%div;
      int B =n/div;
    return A*mul+B;

}
   
   public static void main(String[] args) {
     // write your code here  
     int n = scn.nextInt();
     int k = scn.nextInt();
    System.out.println(rotateNumber(n,k));   
    }
   }

/*import java.util.Scanner;
   
   public class Main{
       
    public static Scanner scn = new Scanner(System.in);
    public static int CountDigit(int n)
    {
    int ctr=0;
    int num = n;
    while(num!=0)
    {
        num /= 10;
        ctr++;
    }
    return ctr;
   }  
   
   public static int rotatenumber(int n,int r){
       int len = CountDigit(n);
       r %= len;
       if(r<0){
           r = (r+len)%len;
       }
       int mul=1;
       int div=1;
       for(int i =1;i<=len;i++){
           if(i<=r){
               div *= 10;
           }
           else{
               mul *= 10;
           }
       }
           
           int A = n%div;
           int B = n/div;
       //    System.out.println(A*mul+B);
         //  return 0;
           
       return A*mul+B;
       
   }
   
   public static void main(String[] args) {
     // write your code here  
     int n = scn.nextInt();
     int k = scn.nextInt();
     System.out.println(rotatenumber(n,k));
    }
   }
   
 */