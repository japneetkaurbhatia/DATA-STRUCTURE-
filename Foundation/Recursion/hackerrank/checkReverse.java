//https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-18stringonetwoarereverse/copy-from/1330961718

import java.io.*;
import java.util.*;

public class Solution {
    
    public static Scanner scn = new Scanner(System.in);
    
    public static boolean reverseString(String str1,int idx1, String str2,int idx2){
        if(idx2 == -1) return true;
        if(str1.charAt(idx1)!=str2.charAt(idx2))  return false;
        return reverseString(str1,idx1 + 1,str2,idx2 - 1);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String str1 = scn.next();
        String str2 = scn.next();
        if(str1.length()==str2.length())        {
            if(reverseString(str1,0,str2,str2.length()-1))  System.out.println("true");
            else System.out.println("false");
        }
        else
            System.out.println("false");
    }
}
