public class bst {
    public static class Node {
        int data = 0;
        Node left = null;
        Node right = null;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node constructTree(int[] arr, int si, int ei) {
        if (si > ei)
            return null;

        int mid = (si + ei) / 2;
        Node node = new Node(arr[mid]);

        node.left = constructTree(arr, si, mid - 1);
        node.right = constructTree(arr, mid + 1, ei);

        return node;
    }

    public static Node constructTree(int[] arr){
        return constructTree(arr, 0, arr.length - 1);
    }

    public static int size(Node node){
        if (node == null)
            return 0;
        int left = size(node.left);
        int right = size(node.right);

        return left + right + 1;
    }

    public static int sum(Node node){
        if (node == null)
            return node.data;
        int left = sum(node.left) + node.data;
        int right = sum(node.right) + node.data;

        return node.data;
    }

    public static int height(Node node){
        if(node == null) return -1;

        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left,right) + 1;
    }

    public static class Node {
        int data = 0;
        Node left = null;
        Node right = null;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node constructTree(int[] arr, int si, int ei) {
        if (si > ei)
            return null;

        int mid = (si + ei) / 2;
        Node node = new Node(arr[mid]);

        node.left = constructTree(arr, si, mid - 1);
        node.right = constructTree(arr, mid + 1, ei);

        return node;
    }

    public static Node constructTree(int[] arr) {
        return constructTree(arr, 0, arr.length - 1);
    }

    public static int size(Node node) {
        return node == null ? 0 : size(node.left) + size(node.right) + 1;

    }

    public static int height(Node node) {
        return node == null ? -1 : Math.max(height(node.left), height(node.right));
    }

    public static int maximum(Node node) {
        Node curr = node;
        while (curr.right != null) {
            curr = curr.right;
        }

        return curr.data;
    }

    public static int maximumRec(Node node) {
        if (node.right == null)
            return node.data;
        return maximumRec(node.right);
    }

    public static int minimum(Node node) {
        Node curr = node;
        while (curr.left != null) {
            curr = curr.left;
        }

        return curr.data;
    }

    public static boolean find(Node node, int data) {
        Node curr = node;

        while (curr != null) {
            if (curr.data == data)
                return true;
            else if (curr.data < data)
                curr = curr.right;
            else
                curr = curr.left;
        }

        return false;
    }

    public static Node addData(Node node, int data) {
        if (node == null)
            return new Node(data);

        if (node.data < data)
            node.right = addData(node.right, data);
        else
            node.left = addData(node.left, data);

        return node;
    }

    public static Node addData_Itr(Node node, int data) {
        if (node == null)
            return new Node(data);

        Node curr = node;
        Node dNode = new Node(data);
        while (true) {
            if (curr.data == data)
                break;
            else if (curr.data < data) {
                if (curr.right != null)
                    curr = curr.right;
                else {
                    curr.right = dNode;
                    break;
                }
            } else {
                if (curr.left != null)
                    curr = curr.left;
                else {
                    curr.left = dNode;
                    break;
                }
            }
        }

        return node;
    }

    public static Node LCA(Node node, int p, int q) {
        Node curr = node;
        while (curr != null) {
            if (curr.data < p && curr.data < q)
                curr = curr.right;
            else if (curr.data > p && curr.data > q)
                curr = curr.left;
            else
                return (find(curr, p) && find(curr, q)) ? curr : null;
        }
        return null;
    }



}