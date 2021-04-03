import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // write your code here
        String str = scn.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int freq = 0;
        char ans = ' ';
        for(char ch : map.keySet()){
            if(map.get(ch) > freq){
                ans = ch;
                freq = map.get(ch);
            }
        }
        System.out.print(ans);
    }

}
