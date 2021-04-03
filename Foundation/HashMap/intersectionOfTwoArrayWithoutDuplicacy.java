import java.util.HashMap;
import java.util.Scanner;
public class intersectionOfTwoArrayWithoutDuplicacy{
    public static Scanner scn = new Scanner(System.in);
    public static void basic(int[] arr1, int[] arr2){    
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr1){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele : arr2){
            if(map.containsKey(ele)){
                System.out.println(ele);
                map.put(ele,map.get(ele)-1);
                if(map.get(ele)==0)
                    map.remove(ele);
            }
        }
    }
    public static void main(String[] args){
        int a1[5] = {2, 3, 2, 1, 5};
        int a2[5] = {9, 6, 7, 5, 3};
        basic(a1,a2);
    }    
}
