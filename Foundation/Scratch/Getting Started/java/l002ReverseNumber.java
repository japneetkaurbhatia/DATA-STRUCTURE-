import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
public static void reverseNumber(int n){
    int ans=0,lastDigit=0;
    while(n!=0){
        lastDigit = n%10;
        n /= 10;
         System.out.println(lastDigit);
    }
    
}



    public static void main(String[] args) {
        // write your code here  
        int n = scn.nextInt();
        reverseNumber(n);
    }
}
