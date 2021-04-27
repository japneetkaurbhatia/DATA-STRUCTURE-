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

    //Sort K Sorted
    public static void kSorted(int[] arr, int k){
       PriorityQueue<Integer> pq = new PriorityQueue<>(); 
           int i = 0;
        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k)
                arr[i++] = pq.remove();
        }
        while(pq.size() != 0){
            arr[i++] = pq.remove();
        }
         for(int ele : arr){
             System.out.println(ele);
         }
    }

    //mergeksorted
     public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> rv = new ArrayList<>();

      // write your code here
      public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> rv = new ArrayList<>();

      // write your code here
      PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> { return a[0]-b[0];});
      for(int i = 0; i < lists.size(); i++){
          pq.add(new int[] {lists.get(i).get(0),0,i});
      }
      while(pq.size() != 0){
          int[] ar = pq.remove();
          rv.add(ar[0]);

          int idx = ar[1];
          int listIdx = ar[2];
          int length = lists.get(listIdx).size();

          if(idx + 1 < length){
              ar[1]++;
              ar[0] = lists.get(listIdx).get(idx+1);
              pq.add(ar);
          }
      }

      return rv;
   }

   //Merge Sorted List
   public static ArrayList<Integer> mergeTwoList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, n = list1.size();
        int j = 0, m = list2.size();

        while (i < n && j < m) {
            if (list1.get(i) < list2.get(j))
                ans.add(list1.get(i++));
            else
                ans.add(list2.get(j++));
        }

        while (i < n) {
            ans.add(list1.get(i++));
        }

        while (j < m) {
            ans.add(list2.get(j++));
        }

        return ans;
    }

    //LC 242
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()) return false;
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(freq[i] != 0)
                return false;
        }
        return true;
    }

    //LC 49
    public static String RLES(String str) { // run Length Encoded String
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i) - 'a']++;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++)
            if (freq[i] != 0) {
                sb.append((char) (i + 'a'));
                sb.append(freq[i]);
            }

        return sb.toString();
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String s : strs) {
            String rles = RLES(s);
            map.putIfAbsent(rles, new ArrayList<>());
            map.get(rles).add(s);
        }

        List<List<String>> ans = new ArrayList<>();
        for (String key : map.keySet())
            ans.add(map.get(key));

        return ans;
    }

    public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists, int si, int ei) {
        if (si == ei)
            return lists.get(si);
        int mid = (si + ei) / 2;
        ArrayList<Integer> list1 = mergeKSortedLists(lists, si, mid);
        ArrayList<Integer> list2 = mergeKSortedLists(lists, mid + 1, ei);
        return mergeTwoList(list1, list2);
    }

    public static void main(String[] args){
        minPQ();
        System.out.println();
        maxPQ();
    }
}