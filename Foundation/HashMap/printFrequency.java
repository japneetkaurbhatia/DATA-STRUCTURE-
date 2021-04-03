import java.util.HashMap;
import java.util.Scanner;
public class printFrequency{
    public static Scanner scn = new Scanner(System.in);
    public static void basic(String str){    
        HashMap<Character,Integer> map = new HashMap<>();

        // method-1
        // for(int i = 0; i < str.length(); i++){
        //     char ch = str.charAt(i);
        //     if(map.containsKey(ch)){
        //         map.put(ch, map.get(ch)+1);
        //     }
        //     else{
        //         map.put(ch,1);
        //     }
        // }  

        // method-2
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        System.out.println(map);
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        basic(str);
    }     
}
