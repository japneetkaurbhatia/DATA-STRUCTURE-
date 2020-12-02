import java.util.*;

public class Main {

    public static Scanner scn = new Scanner(System.in);

    public static int lcm(int a, int b,int gcd)
    {
      //  int gcd = gcd(a,b);
        return ((a / gcd) * b);
    }

    public static int gcd(int a, int b) {
        int divisor = a;
        int dividend = b;

        while (dividend % divisor != 0) {
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        return divisor;
    }

    public static void main(String[] args) {
        // write your code here  
        int a = scn.nextInt();
        int b = scn.nextInt();
        int gcd = gcd(a,b);
        System.out.println(gcd +"\n" + lcm(a,b,gcd));
        //System.out.println(gcd(a,b));
        //System.out.println(lcm(a,b));
    }
}