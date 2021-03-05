  public static boolean rootToNodePath(Node root, int data, ArrayList<Node> ans) {
        if (root == null)
            return false;
        boolean res = (root.data == data) || rootToNodePath(root.left, data, ans)
                || rootToNodePath(root.right, data, ans);

        if (res)
            ans.add(root);
        return res;
    }
    
    public static void printAtDepthK(Node root, Node block, int k) {
        if (root == null || root == block || k < 0)
            return;

        if (k == 0) {
            System.out.println(root.data);
            return;
        }

        printAtDepthK(root.left, block, k - 1);
        printAtDepthK(root.right, block, k - 1);
    }

  public static void printKNodesFar(Node root, int data, int k) {
    // write your code here
    ArrayList<Node> path = new ArrayList<>();
    rootToNodePath(root, data, path);

        Node block = null;
        for (int i = 0; i < path.size(); i++) {
            printAtDepthK(path.get(i), block, k - i);
            block = path.get(i);
        }
  }