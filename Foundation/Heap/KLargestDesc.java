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
