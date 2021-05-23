import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static Scanner scn = new Scanner(System.in);
    public static String replaceHiWithPep(String str, int idx){
        if(idx >= str.length() - 1){
            return str;
        }
        String res = str.substring(idx,idx+2);
        if(res.equals("hi"))
            return "pep" + replaceHiWithPep(str,idx+2);
        else
            return str.charAt(idx) + replaceHiWithPep(str,idx+1);
    }
    public static void replaceHiWithPep_WayUp(String str, int idx, String ans){
        if(idx >= str.length() - 1){
            if(idx == str.length())    System.out.println(ans);
            else    System.out.println(ans + str.charAt(str.length()-1));
            return;            
        }
        String res = str.substring(idx,idx+2);
        if(res.equals("hi"))
            replaceHiWithPep_WayUp(str,idx+2,ans + "pep");
        else
            replaceHiWithPep_WayUp(str,idx+1,ans + str.charAt(idx));
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String str = scn.next();
        int i = scn.nextInt();
        String ans = replaceHiWithPep(str,0);
        System.out.println(ans.charAt(i));
        replaceHiWithPep_WayUp(str,0,"");
    }
}
