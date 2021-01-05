import java.util.Scanner;
public class l002countDigit{
    public static Scanner scn = new Scanner(System.in);
    public static int countDigit(int n){
        int ctr = 0;
        while(n!=0){
            n /= 10;
            ctr++;
        }
        return ctr;
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        System.out.println(countDigit(n));
    }
}
