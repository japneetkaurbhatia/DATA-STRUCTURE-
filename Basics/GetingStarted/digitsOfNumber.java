import java.util.*;
    
    public class Main{
    
    public static Scanner scn = new Scanner(System.in);
    public static int countDigit(int n){
        int p = 0;
        while(n!=0){
            p++;
            n /= 10;
        }
        return p;
    }
    public static void digitOfNumber(int n){
        int ctr = countDigit(n);
        int div = 1;
        while(ctr>1){
            div *= 10;
            ctr--;
        }
        while(div>0){
            System.out.println(n/div);
            n %= div;
            div /= 10;
            
        }
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        digitOfNumber(n);
    }
    }