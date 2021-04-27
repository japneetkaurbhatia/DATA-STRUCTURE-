import java.util.HashMap;
public class l001_basic{
    public static void basic_01(){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Nepal",233);
        map.put("UK",50);
        map.put("USA",19);
        map.put("Russia",22);
        map.put("USA",20);
        map.put("India",17);

        // System.out.print(map);

        // for(String keys : map.keySet()){
        //     System.out.println(keys + " -> " + map.get(keys));
        // }

        // String key = "Usa";
        // if(map.containsKey(key)){
        //     System.out.print(map.get(key));
        // }
        // else{
        //     System.out.print("Not found");
        // }
    }
    public static void main(String[] args){
        basic_01();
    }
    
}