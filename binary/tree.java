public class tree{
//is Binary tree
public static Node prev = null;
public static boolean isBST(Node node) {
        if (node == null)
        return true;
        boolean leftRes = isBST(node.left);
        if (!leftRes)
            return false;
        if (prev != null && prev.data > node.data)
            return false;
        prev = node;
        boolean rightRes = isBST(node.right);
        if (!rightRes)
            return false;
        return true;
    }
    public class isBSTSolPair {
        int maxEle = -(int) 1e8;
        int minEle = (int) 1e8;
        boolean isBST = true;
    }
    public isBSTSolPair isBST_(Node node) {
        if (node == null) {
            return new isBSTSolPair();
        }

        isBSTSolPair left = isBST_(node.left);
        isBSTSolPair right = isBST_(node.right);

        isBSTSolPair myRes = new isBSTSolPair();
        myRes.isBST = false;
        if (left.isBST && right.isBST && left.maxEle < node.data && node.data < right.minEle) {
            myRes.isBST = true;
            myRes.maxEle = Math.max(node.data, right.maxEle);
            myRes.minEle = Math.min(node.data, left.minEle);
        }

        return myRes;
    }

    //isBalance 
    public static class isBalPair {
        int height = -1;
        boolean balanceTree = true;
    }

    public static isBalPair isBal_(Node node) {
        if (node == null)
            return new isBalPair();

        isBalPair left = isBal_(node.left);
        if (!left.balanceTree)
            return left;

        isBalPair right = isBal_(node.right);
        if (!right.balanceTree)
            return right;
        

        isBalPair myRes = new isBalPair();
        myRes.balanceTree = false;
        if (left.balanceTree && right.balanceTree && Math.abs(left.height - right.height) <= 1) {
            myRes.balanceTree = true;
            myRes.height = Math.max(left.height, right.height) + 1;
        }

        return myRes;
    }

    public static boolean isBal(Node node) {
        isBalPair ans = isBal_(node);
        return ans.balanceTree;
    }

//     public static int isBalanced(Node node){
//       if(node == null)  return -1;
      
//       int leftHeight = isBalanced(node.left);
//       int rightHeight = isBalanced(node.right);
      
//       return leftHeight-rightHeight;
//   }
//   int ans = isBalanced(root);
//     if(Math.abs(ans) + 1 <= 1)
//       System.out.println(true);
//     else
//       System.out.println(false);
}