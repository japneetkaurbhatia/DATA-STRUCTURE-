public class allSolution{
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

    public static isBSTSolPair allSolution(Node node){

        isBSTSolPair = allSolution(node.left);
        isBSTSolPair = allSolution(node.right);

        isBSTSolPairans = new isBSTSolPair();

        ans.isBST = left.isBST && right.isBST && left.maxEle < node.data && node.data < right.minEle;
        ans.isBal = left.isBal && right.isBal && Math.abs(left.height - right.height) <= 1;

        ans.maxEle = Math.max(node.data, right.maxEle);
        ans.minEle = Math.min(node.data, left.minEle);
        ans.height = Math.max(left.height, right.height) + 1;

        ans.totalNoOfBST = left.totalNoOfBST + right.totalNoOfBST + (ans.isBST ? 1 : 0);

        if (ans.isBST) {
            ans.largestBSTNode = node;
            ans.largestBSTSize += left.largestBSTSize + right.largestBSTSize + 1;
        } else {
            if (left.largestBSTSize > right.largestBSTSize) {
                ans.largestBSTNode = left.largestBSTNode;
                ans.largestBSTSize = left.largestBSTSize;
            } else {
                ans.largestBSTNode = right.largestBSTNode;
                ans.largestBSTSize = right.largestBSTSize;
            }
        }

        return ans;
    }        
    }   
}
