import java.io.*;
import java.util.*;

public class Main {
    
    public static Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        System.out.print(gss2(scn.nextLine(),0));
    }

    public static ArrayList<String> gss2(String str,int idx) {
        if(idx == str.length()){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(idx);
        
        ArrayList<String> smallAns = gss2(str,idx+1);
        ArrayList<String> myAns = new ArrayList<>(smallAns);
   
        for(String s : smallAns)  myAns.add(ch + s);
        return myAns;
    }

}