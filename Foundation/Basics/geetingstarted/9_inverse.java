import java.util.*;

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

public static int inverse(int n)
{
    int num = n;
    int len = CountDigit(num);
    int sum =0;
    for(int i =1;i <= len; i++){
        int digit = num%10;
        num /= 10;
        sum += i*Math.pow(10,digit-1);
    }
    return sum;
}

public static void main(String[] args) {
  // write your code here  
  int n = scn.nextInt();
  System.out.println(inverse(n));
 }
}