public static Node remove(Node node, int data) {
    // write your code here
    if(node == null)  return null;
     if(node.data < data){
        node.right = remove(node.right,data);
     }
     else if(node.data > data){
        node.left = remove(node.left,data);
    }
    else{
        if(node.left == null || node.right == null)
          return node.left != null ? node.left : node.right;
    
    int maxData = maximum(node.left);
    node.data = maxData;
    node.left = remove(node.left,maxData);
  }
    return node;
  }