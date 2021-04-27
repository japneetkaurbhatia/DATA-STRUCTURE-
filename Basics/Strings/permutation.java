import java.io.*;
import java.util.*;

public class permutation {

    public static Scanner scn = new Scanner(System.in);

	public static ArrayList<String> appendCharInString(String str, char ch){
		ArrayList<String> ans = new ArrayList<>();
		for(int i = 0; i <= str.length(); i++){
		    String s = str.substring(0,i) + ch + str.substring(i);
            ans.add(s);
		}
        return ans;
	}

    public static ArrayList<String> permutation(String str){
        ArrayList<String> ans = new ArrayList<>();
        ans.add("");
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            ArrayList<String> smallAns = new ArrayList<>();
            for(String s : ans){
                smallAns.addAll(appendCharInString(s,ch));
            }
            ans = smallAns;
        }
        return ans;
    }

	public static void main(String[] args) {		
		System.out.println(permutation("abc"));
	}

}
