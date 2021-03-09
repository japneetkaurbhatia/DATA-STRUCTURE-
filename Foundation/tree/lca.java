public static Node LCA(Node node, int p, int q) {
        ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();

        rootToNodePath(node, p, list1);
        rootToNodePath(node, q, list2);

        int i = list1.size() - 1;
        int j = list2.size() - 1;

        Node lca = null;
        while (i >= 0 && j >= 0) {
            if (list1.get(i) != list2.get(j))
                break;

            lca = list1.get(i);
            i--;
            j--;
        }

        return lca;
    }
