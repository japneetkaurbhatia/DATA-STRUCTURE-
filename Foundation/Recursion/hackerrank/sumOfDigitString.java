//https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-16sumofdigitinstring

import java.io.*;
import java.util.*;

public class Solution {
    
    public static int sumOfDigit(String str,int idx){
        if(idx == str.length()) return 0;
        int recAns = sumOfDigit(str,idx+1);
        return recAns + (str.charAt(idx) - '0');
    } 

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(sumOfDigit(str,0));
    }
}
