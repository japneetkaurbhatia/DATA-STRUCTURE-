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
