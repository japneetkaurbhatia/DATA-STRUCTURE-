
  public static void pir(Node node, int d1, int d2) {
    // write your code here
    Node curr = node;
    if(curr == null)  return;
    if(d1 < curr.data){
        pir(curr.left,d1,d2);
    }
    if(d1 <= curr.data && d2 >= curr.data){
        System.out.println(curr.data);
    }
    if(d2 > curr.data){
        pir(curr.right,d1,d2);
    } 
  }
