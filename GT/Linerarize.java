public class linearize{
public static Node getTail(Node node){
      Node curr = node;
      while(curr.children.size() != 0){
          curr = curr.children.get(0);
      }
      return curr;
  }
  public static void linearize(Node node){
    for(Node child : node.children)
       linearize(child);
    for(int i = node.children.size()-2; i >= 0; i--){
        Node tail = getTail(node.children.get(i));
        tail.children.add(node.children.get(i+1));
        node.children.remove(i+1);
    }
  }
  //better
  public static Node linearize_(Node node){    
   if(node.children.size() == 0)  return node;
   int n = node.children.size();
   Node globalTail = linearize_(node.children.get(n-1));
   for(int i = n -2; i >= 0; i--){
       Node tail = linearize_(node.children.get(i));
       tail.children.add(node.children.get(i+1));
       node.children.remove(i+1);
   }
   return globalTail;
  }
}