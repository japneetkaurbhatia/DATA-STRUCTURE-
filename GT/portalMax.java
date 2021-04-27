 public static int max(Node node) {
    // write your code here
    int maxEle = -(int) 1e8;
        for (Node child : node.children) {
            maxEle = Math.max(maxEle, max(child));
        }   

        return Math.max(maxEle, node.data);
  }