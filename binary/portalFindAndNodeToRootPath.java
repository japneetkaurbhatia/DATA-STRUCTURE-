public static boolean find(Node root, int data){
    // write your code here
    if (root == null)
        return false;

        return root.data == data || find(root.left, data) || find(root.right, data);
    
  }

  public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    if(node == null){
      return new ArrayList<>();
    }

    if(node.data == data){
      ArrayList<Integer> list = new ArrayList<>();
      list.add(node.data);
      return list;
    }

    ArrayList<Integer> llist = nodeToRootPath(node.left, data);
    if(llist.size() > 0){
      llist.add(node.data);
      return llist;
    }

    ArrayList<Integer> rlist = nodeToRootPath(node.right, data);
    if(rlist.size() > 0){
      rlist.add(node.data);
      return rlist;
    }

    return new ArrayList<>();
  }
