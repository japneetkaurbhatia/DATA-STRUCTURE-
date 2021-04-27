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