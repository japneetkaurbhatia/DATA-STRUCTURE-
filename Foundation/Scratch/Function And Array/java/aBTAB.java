import java.util.*;

public class Main {
    public static int anyBaseToDecimal(int n,int b){
        int p = 1;
        int res = 0;
        while(n!=0){
            int lastDigit = n%10;
            n /= 10;
            res += lastDigit*p;
            p *= b;
        }
        return res;
    }
    public static int decimalToAnyBase(int n,int b){
        int p = 1;
        int res = 0;
        while(n!=0){
            int rem = n%b;
            n /= b;
            res += p*rem;
            p *= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int convert;
        convert = anyBaseToDecimal(n,sourceBase);
        System.out.println(decimalToAnyBase(convert,destBase));
    }
}
