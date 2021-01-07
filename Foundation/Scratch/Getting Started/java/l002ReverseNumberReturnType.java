import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
public static int reverseNumber(int n){
    int ans=0,lastDigit=0;
    while(n!=0){
        lastDigit = n%10;
        n /= 10;
         
       ans = ans * 10 + lastDigit;
       
    }
    return ans;
    
}

public static void main(String[] args){
    int n = scn.nextInt();
   
System.out.println(reverseNumber(n));
    //write your code here
 
}
}
