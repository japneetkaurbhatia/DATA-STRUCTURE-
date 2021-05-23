import java.io.*;
import java.util.*;

public class Solution {

    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long q = scn.nextInt();
        while(q-- > 0){
           long ctr = 0;
           long n = scn.nextInt();
           long k = scn.nextInt();
           long low = 1, high = n/2;
            while(low < high){
                long mid = (low+high+1)/2;
                if((mid * (n - mid)) > (n * k))   high = mid - 1;
                else    low = mid;
            }
           ctr = (2*low) - ((2*low == n) ? 1 : 0);
           if(low > high)   ctr = 0; 
           System.out.println(ctr); 
        }
    }
}
