import java.io.*;
import java.util.*;

public class appendChar {

    public static Scanner scn = new Scanner(System.in);

	public static ArrayList<String> appendCharInString(String str, char ch){
		ArrayList<String> ans = new ArrayList<>();
		for(int i = 0; i <= str.length(); i++){
		    String s = str.substring(0,i) + ch + str.substring(i);
            ans.add(s);
		}
        return ans;
	}

	public static void main(String[] args) {		
		System.out.println(appendCharInString("abcde",'f'));
	}

}