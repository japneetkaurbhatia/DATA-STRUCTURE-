import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
		if(str.length()==0) return "";
        StringBuilder sb = new StringBuilder();
        char prevChar = str.charAt(0);
        int i = 1;
        while(i <= str.length()){
            while(i < str.length() && prevChar == str.charAt(i)){
                prevChar = str.charAt(i++);
            }
            sb.append(prevChar);
            if(i==str.length())
               break;
            prevChar = str.charAt(i++);
        }
        return sb.toString();
	}

	public static String compression2(String str){
		// write your code here
		if(str.length()==0) return "";
        StringBuilder sb = new StringBuilder();
        char prevChar = str.charAt(0);
        int i = 1;
        while(i <= str.length()){
            int count = 1;
            while(i < str.length() && prevChar == str.charAt(i)){
                count++;
                prevChar = str.charAt(i++);
            }
            sb.append(prevChar);
            if(count > 1)  sb.append(count);
            if(i==str.length())
               break;
            prevChar = str.charAt(i++);
        }
        return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}