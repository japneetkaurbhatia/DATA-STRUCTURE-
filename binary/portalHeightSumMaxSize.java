public static int size(Node root) {
    // write your code here
    if (root == null)
            return 0;
    int left = size(root.left);
    int right = size(root.right);

    return left + right + 1;
  }

  public static int sum(Node root) {
    // write your code here
    if (root == null)
            return 0;

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return leftSum + root.data + rightSum;

  }

  public static int max(Node root) {
    // write your code here
    if (root == null)
            return -(int) 1e8;

        int leftMax = max(root.left);
        int rightMax = max(root.right);

        return Math.max(Math.max(leftMax, rightMax), root.data);
  }

  public static int height(Node root) {
    // write your code here
    if (root == null)
            return -1;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
