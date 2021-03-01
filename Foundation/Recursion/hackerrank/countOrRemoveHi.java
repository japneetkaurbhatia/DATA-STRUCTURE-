// https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-23countorremovehi

import java.io.*;
import java.util.*;

public class Solution {
    public static int countHi(String str, int i){
        if(i == str.length())  return 0;
        String s = str.substring(i,i+2);
        if(s.equals("hi")){
            return countHi(str,i+2) + 1;
        }else{
            return countHi(str,i+1);
        }
    }
    
    public static String operateHi(String str, int i, String ans){
        if(i == str.length()){
            return ans;           
        }  
        String s = str.substring(i,i+2);
        if(s.equals("hi")){
            return operateHi(str,i+2,ans);
        }else{
            return operateHi(str,i+1,ans + str.charAt(i));
        }
    }
    
    public static void removeHi(String str, int i, String ans){
        if(i == str.length()){
            System.out.println(ans);
            return;            
        }  
        String s = str.substring(i,i+2);
        if(s.equals("hi")){
            removeHi(str,i+2,ans);
        }else{
            removeHi(str,i+1,ans + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int i = scn.nextInt();
        System.out.println(countHi(str,0));
        String ans = operateHi(str,0,"");
        System.out.println(ans.charAt(i));
        removeHi(str,0,"");
        // removeCharWayUp(str,0,"","",ch);
    }
}
