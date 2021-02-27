// https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-20separateduplicates/copy-from/1330967619

//way down

import java.io.*;
import java.util.*;

public class Solution {
    
    public static String sepDuplicates(String str){
        if(str.length() == 1)  return str;
        char ch = str.charAt(0);
        
        String res = sepDuplicates(str.substring(1));
        if(ch != res.charAt(0))  return ch + res;
        else return ch + "*" + res;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int i = scn.nextInt();
        String ans = sepDuplicates(str);
        System.out.println(ans.charAt(i));
        System.out.println(ans);
    }
}
