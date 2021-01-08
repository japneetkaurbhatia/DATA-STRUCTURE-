import java.util.*;

public class Main {
public static Scanner scn = new Scanner(System.in);
public static int countDigit(int n){
    int ctr=0;
    while(n!=0){
     int r = n%10;
     ctr++;
     n /= 10;
    }
    return ctr;
}
public static void digitOfNumber(int n){
   int len = countDigit(n);
   int div = 1;
   while(len>1){
       div = div*10;
       len--;
   }
   while(div!=0){
       System.out.println(n/div);
       n %= div;
       div /= 10;
   }
}
    public static void main(String[] args) {
        // write your code here 
        int n = scn.nextInt();
        digitOfNumber(n);
    }
}
