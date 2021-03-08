public static int isBalanced(Node node){
      if(node == null)  return -1;
      
      int leftHeight = isBalanced(node.left);
      int rightHeight = isBalanced(node.right);
      
      return leftHeight-rightHeight;
  }
  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
    
    // write your code here
    int ans = isBalanced(root);
    if(Math.abs(ans) + 1 <= 1)
      System.out.println(true);
    else
      System.out.println(false);
  }
