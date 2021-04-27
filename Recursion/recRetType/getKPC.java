

import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String s = scn.nextLine();
        System.out.println(getKPC(s,0));
    }
    
    
    public static ArrayList<String> getKPC(String str,int idx) {
        if(idx == str.length()){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz" };
        
        char ch = str.charAt(idx);
        int codeIdx = ch - '0';
        String code = codes[codeIdx];
        ArrayList<String> smallAns = getKPC(str,idx+1);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i < code.length();i++){
            for(String s : smallAns){
                ans.add(code.charAt(i) + s);
            }
        }
        return ans;
        
    }

}