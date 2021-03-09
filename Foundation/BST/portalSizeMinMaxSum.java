
  public static int size(Node node) {
    // write your code here
    if (node == null)
            return 0;
    int left = size(node.left);
    int right = size(node.right);

        return left + right + 1;
  }
  
 

  public static int sum(Node node) {
    // write your code here
     if (node == null)
            return 0;

    int leftSum = sum(node.left);
    int rightSum = sum(node.right);

    return leftSum + node.data + rightSum;
  }

   public static int max(Node node) {
     // write your code here
      Node curr = node;
    while(curr.right!=null){
        curr = curr.right;
    }
    return curr.data;
   }

  public static int min(Node node) {
    // write your code here
    Node curr = node;
    while(curr.left!=null){
        curr = curr.left;
    }
    return curr.data;
  }

  public static boolean find(Node node, int data){
    // write your code here
    Node curr = node;
    while(curr!=null){
        if(curr.data == data)
          return true;
        else if(curr.data < data)
          curr = curr.right;
        else
         curr = curr.left;
    }
    return false;
  }  
