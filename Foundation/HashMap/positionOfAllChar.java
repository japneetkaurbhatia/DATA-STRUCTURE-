import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
public class positionOfAllChar{
    public static Scanner scn = new Scanner(System.in);
    public static void basic(String str){    
       HashMap<Character, ArrayList<Integer>> map = new HashMap<>();

    //    method-1
    //    for(int i = 0; i < str.length(); i++){
    //        char ch = str.charAt(i);
    //        if(!map.containsKey(ch)){
    //            map.put(ch, new ArrayList<>()); //new arrayList **IMPORTANT**
    //        }
    //        map.get(ch).add(i);
    //    }
         
        // method-2
        for(int i = 0; i < str.length(); i++){
           char ch = str.charAt(i);
           map.putIfAbsent(ch, new ArrayList<>());
           map.get(ch).add(i);
        }

       System.out.println(map);
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        basic(str);
    }    
}
