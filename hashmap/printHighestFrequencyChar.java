import java.util.HashMap;
import java.util.Scanner;
public class printHighestFrequencyChar{
    public static Scanner scn = new Scanner(System.in);
    public static void basic(String str){    
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        char ans = ' ';
        int freq = 0;
        for(Character ch : map.keySet()){
            if(map.get(ch) > freq){
                freq = map.get(ch);
                ans = ch;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        basic(str);
    }    
}