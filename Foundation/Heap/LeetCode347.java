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
