import java.io.*;
import java.util.*;

public class Main {
    
    public static Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        System.out.print(gss(scn.nextLine()));
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        ArrayList<String> smallAns = gss(ros);
        ArrayList<String> myAns = new ArrayList<>(smallAns);
   
        for(String s : smallAns)  myAns.add(ch + s);
        return myAns;
    }

}

///////////////or//////////////////////

import java.io.*;
import java.util.*;

public class Main {
    
    public static Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        System.out.print(gss(scn.nextLine()));
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        ArrayList<String> smallAns = gss(ros);
        ArrayList<String> myAns = new ArrayList<>();
        
        for(String s : smallAns)  myAns.add(s);
        for(String s : smallAns)  myAns.add(ch + s);
        return myAns;
    }

}