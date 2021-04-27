import java.util.ArrayList;

public class l003GT {
    public static class Node {
        int data = 0;
        ArrayList<Node> childs;

        Node(int data) {
            this.data = data;
        }
    }

    public static int size(Node node) {
        int sz = 0;
        for (Node child : node.childs) {
            sz += size(child);
        }

        return sz + 1;
    }

    public static int height(Node node) {
        int h = 0;
        for (Node child : node.childs) {
            h = Math.max(h, height(child));
        }

        return h + 1;
    }

    public static int maximum(Node node) {
        int maxEle = -(int) 1e8;
        for (Node child : node.children) {
            maxEle = Math.maximum(maxEle, max(child));
        }   

        return Math.max(maxEle, node.data);
    }
//36
//10 20 50 70 -1 80 -1 60 10 -1 20 -1 30 70 12 -1 13 -1 80 110 -1 120 -1 -1 90 30  -1 33 -1 40 100 12 -1 16  22 -1
    public static int minimum(Node node) {
        int minEle = (int) 1e8;
        for (Node child : node.childs) {
            minEle = Math.min(maxEle, minimum(child));
        }   

        return Math.min(minEle, node.data);

    }

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

    public static int find(Node node) {
        
}