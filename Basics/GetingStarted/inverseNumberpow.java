import java.util.*;

public class Main{
public static Scanner scn = new Scanner(System.in);
public static int countDigit(int n){
    int ctr=0,rem;
    while(n>0){
        rem = n%10;
        ctr++;
        n /= 10;
    }
    return ctr;
}
public static int inverse(int n){
    int len = countDigit(n);
    int ans = 0;
    for(int i = 1; i <= len; i++){
        int r = n%10;
        n /= 10;
        ans += i*Math.pow(10,(r-1));
        
    }
    return ans;
}
public static void main(String[] args) {
  // write your code here  
  int n = scn.nextInt();
  System.out.println(inverse(n));
 }
}