import java.util.ArrayList;

public class l001basic {

    public static class Edge {
        int v = 0;
        int w = 0;

        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }

        public String toString() {
            return "(" + this.v + ", " + this.w + ") ";

        }
    }

    public static int N = 7;
    public static ArrayList<Edge>[] graph = new ArrayList[N];

    public static void addEdge(int u, int v, int w) {
        graph[u].add(new Edge(v, w));
        graph[v].add(new Edge(u, w));
    }

    public static void display() {
        for (int i = 0; i < N; i++) {
            System.out.print(i + " -> ");
            for (Edge e : graph[i]) {
                System.out.print(e);
            }
            System.out.println();
        }
    }

    public static int findEdge(int u, int v) {
        // for (int i = 0; i < N; i++){
        //     if(i == u){
        //         for (Edge e : graph[i]) {
        //             if(e.v == v)
        //                 return e.w;
        //         }
        //     }
        // }
        // return -1;
        for(int i = 0; i < graph[u].size(); i++){
            Edge e = graph[u].get(i);
            if(e.v == v)
                returni;
        }
        return -1;
    }

    public static void removeEdge(int u, int v) {
        // for (int i = 0; i < N; i++){
        //     if(i == u){
        //         for (Edge e : graph[i]) {
        //             if(e.v == v)
        //                 remove(e.w);
        //         }
        //     }
        // }
        int idx1 = findEdge(u,v);
        int idx2 = findEdge(v,u);

        graph[u].remove(idx1);
        graph[v].remove(idx2);
    }

    public static void removeVtx(int u){
        // for (int i = 0; i < N; i++){
        //     if(i == u){
        //         for (Edge e : graph[i]) {
        //             if(e.v == v)
        //                 remove(e.v);
        //         }
        //     }
        // }
        while(graph[u].size() != 0){
            int n = graph[u].size();
            Edge e = graph[u].get(n-1);
            removeEdge(u,e.v);
        }
    }

    public static boolean hasPath(int src, int dest, boolean[] vis){
        // if(e.dest == dest) return true;
        // for(int i = 0; i < graph[src].size(); i++){
        //     Edge e = graph[src].get(i);
        //     if(e.dest == dest) return true;
        //     else hasPath(i,dest);
        // }
        if(src == dest){
            return true;
        }
        boolean res = false;
        vis[src] = true;
        for(Edge e : graph[src]){
            if(!vis[e.v])
                res = res || hasPath(e.v,dest, vis);
        }
        return res;
    }

    public static int allPath(int src, int dest, boolean[] vis, String ans){
        if(src == dest){
            System.out.println(ans + dest);
            return 1;
        }
        int count = 0;
        vis[src] = true;
        for(Edge e : graph[src]){
            if(!vis[e.v])
                count += allPath(e.v,dest, vis, ans + src);
        }
        vis[src] = false;
        return count;
    }

    public static void printPreOrder(int src, boolean[] vis){

    }

    public static void printPostOrder(int src, boolean[] vis){
        
    }

    public static void main(String[] args) {
        for (int i = 0; i < N; i++)
            graph[i] = new ArrayList<>();
        addEdge(0, 1, 10);
        addEdge(0, 3, 10);
        addEdge(1, 2, 10);
        addEdge(2, 3, 10);
        addEdge(3, 4, 10);
        addEdge(4, 5, 10);
        addEdge(4, 6, 10);
        addEdge(5, 6, 10);

        display();
        System.out.println(findEdge(2,3));
        System.out.println(findEdge(3,3));
        removeEdge(2,3);
        display();
    }

}