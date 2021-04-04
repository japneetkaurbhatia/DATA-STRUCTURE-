import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class basic01{
    //Min PQ
    public static void minPQ(){   //by default
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 10; i >= 0; i--){
            pq.add(i);
        }
        while(pq.size() != 0){
            // int ele = pq.peek();
            // pq.remove();
            // System.out.println(ele);
                    // or
            int ele = pq.remove();
            System.out.println(ele);
        }
    }

    //Max PQ
    public static void maxPQ(){   
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> {                                  // lambda function : this-other #relationship fn
                // return a-b;
                return b-a;
            }
        );
        for(int i = 10; i >= 0; i--){
            pq.add(i);
        }
        while(pq.size() != 0){
            // int ele = pq.peek();
            // pq.remove();
            // System.out.println(ele);
                    // or
            int ele = pq.remove();
            System.out.println(ele);
        }
    }

    //K-Largest
    public static void KLargest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k)
                pq.remove();
        }
        while(pq.size() != 0){
            System.out.println(pq.remove());
        }
    }

    //K-Smallest
    public static void KSmallest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> {
                return b-a;
            }
        );
        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k)
                pq.remove();
        }
        while(pq.size() != 0){
            System.out.println(pq.remove());
        }
    }

    //KLargest Desc
    public static void KLargest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k)
                pq.remove();
        }
        int[] ans = new int[k];
        for( int i = pq.size()-1; i >= 0; i--){
            ans[i] = pq.remove();
        }
        for(int ele : ans){
            System.out.println(ele);
        }
    }

    //LeetCode : 347
    //m-1
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele,0) + 1);
        }

        //{val,freq}
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> {
                return a[1]-b[1];      //minPQ 
            }
        );

        for(Integer e : map.keySet()){
            pq.add(new int[]{e,map.get(e)});

            if(pq.size() > k)
                 pq.remove();
        }

        int[] ans = new int[k];
        int i = 0; 
        while(pq.size() != 0){
            ans[i++] = pq.remove()[0];
        }

        return ans;
    }

    //m-2
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele,0) + 1);
        }

        //{val,freq}
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> {
                return a[1]-b[1];      //minPQ 
            }
        );

        for(Integer e : map.keySet()){
            int val = e;
            int freq = map.get(val);

            int[] arr = new int[]{val, freq};
            pq.add(arr);

            if(pq.size() > k)
                pq.remove();
        }

        int[] ans = new int[k];
        int i = 0; 
        while(pq.size() != 0){
            ans[i++] = pq.remove()[0];
        }

        return ans;
    }

    //m-3
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele,0) + 1);
        }

        //{val,freq}
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> {
                return map.get(a) - map.get(b);      //minPQ 
            }
        );

        for(Integer e : map.keySet()){
            pq.add(e);

            if(pq.size() > k)
                pq.remove();
        }

        int[] ans = new int[k];
        int i = 0; 
        while(pq.size() != 0){
            ans[i++] = pq.remove();
        }

        return ans;
    }

    //LeetCode 692
    //m1
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->{
             if(map.get(a) == map.get(b)){
                return b.compareTo(a);
            }
            return map.get(a) - map.get(b);
        });
        for(String str : map.keySet()){
            pq.add(str);
            
            if(pq.size() > k)
                pq.remove();
        }
        List<String> ans = new ArrayList<>();
        while(pq.size() != 0){
            ans.add(pq.remove());
        }
        
         Collections.sort(ans,(a,b)->{
            if(map.get(a) == map.get(b)){
                return a.compareTo(b);
            }else{
                return map.get(b) - map.get(a);
            }
        });

        return ans;
    }

    //m2
    public List<String> topKFrequent(String[] words, int k) {
         HashMap<String,Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->{
             if(map.get(a) == map.get(b)){
                return b.compareTo(a);
            }
            return map.get(a) - map.get(b);
        });
        for(String str : map.keySet()){
            pq.add(str);
            
            if(pq.size() > k)
                pq.remove();
        }
        int idx = pq.size();
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < idx; i++)
            ans.add("");
        while(pq.size() != 0){
            ans.set(--idx,pq.remove());
        }   
        return ans;
    }

    public static void main(String[] args){
        minPQ();
        System.out.println();
        maxPQ();
    }
}
