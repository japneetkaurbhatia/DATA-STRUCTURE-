public static Node linearize(Node node){
    if(node.children.size() == 0)  return node;
   int n = node.children.size();
   Node globalTail = linearize(node.children.get(n-1));
   for(int i = n -2; i >= 0; i--){
       Node tail = linearize(node.children.get(i));
       tail.children.add(node.children.get(i+1));
       node.children.remove(i+1);
   }
   return globalTail;
  }
