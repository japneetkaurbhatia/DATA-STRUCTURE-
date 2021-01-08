import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static int gcd(int a,int b){
        int dividend = a;
        int divisor = b; 
        while(dividend%divisor != 0){
            int rem = dividend%divisor;
            dividend = divisor; 
            divisor = rem;
        }
        return divisor;
    }
    
    public static int lcm(int a,int b, int g){
        return a*(b/g);
    }

    public static void main(String[] args) {
        // write your code here  
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int g = gcd(n1,n2);
        int l = lcm(n1,n2,g);
        System.out.println(g);
        System.out.println(l);
    }
}
