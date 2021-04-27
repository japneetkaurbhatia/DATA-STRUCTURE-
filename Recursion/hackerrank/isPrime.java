//https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-1gettingstarted-1isprime

import java.io.*;
import java.util.*;

public class Solution {
    
    public static Scanner scn = new Scanner(System.in);
    
    public static boolean isPrime(int n){
        for(int i =2; i*i <= n; i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = scn.nextInt();
        if(isPrime(n)) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}