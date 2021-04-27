public static class isBalPair {
        boolean balanceTree = true;
    }
public static Node prev = null;
public static boolean isBST(Node node){
    if(node == null)  return true;    
    
    boolean leftRes = isBST(node.left);
    if(!leftRes)  return false;
    
    if(prev != null && prev.data > node.data) return false;
    prev = node;
    
    boolean rightRes = isBST(node.right);
    if(!rightRes)  return false;

    return true;
}
public static boolean isBST(Node node) {
        isBSTPair ans = isBST_(node);
        return ans.balanceTree;
    }
