public static int kthLargest_(Node node, int bound){
        int maxLessThanBound = -(int) 1e9;
        for(Node child: node.children){
            int recAns = kthLargest_(child,bound);
            maxLessThanBound = Math.max(maxLessThanBound,recAns);
        }
        if(node.data < bound)
            maxLessThanBound = Math.max(maxLessThanBound,node.data);

        return bound;
    }
    public static int kthLargest(Node node, int k){
        int bound = (int) 1e9;
        while(k-- > 0){
            bound = kthLargest_(node,bound);
        }
        return bound;
    }
