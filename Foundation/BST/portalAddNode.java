public static Node add(Node node, int data) {
     if(node == null) 
      return new Node(data,null,null);
    Node curr = node;
    Node dNode = new Node(data,null,null);
    
    while(true){
        if(curr.data == data)  break;
        else if(curr.data < data){
            if(curr.right != null)
              curr = curr.right;
            else{
              curr.right = dNode;
              break;
            }
        }
        else{
            if(curr.left != null)
              curr = curr.left;
            else{
              curr.left = dNode;
              break;
            }
        }
    }
    return node;
  }
