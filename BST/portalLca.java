 public static int lca(Node node, int d1, int d2) {
    // write your code here
   Node curr = node;
    while(curr!=null){
        if(curr.data < d1 && curr.data<d2)
          curr = curr.right;
        else if(curr.data > d1 && curr.data >d2)
          curr = curr.left;
        else
          return curr.data;
    }
    return 0;
  }
