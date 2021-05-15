import java.util.Scanner;

public class 01FloodFill{

    // public static int floodfill(int sr, int sc, int er, int ec, int[][] vis, int[][] dir, String ans){
        vis[sr][sc] = true;
        int n = vis.length;
        int m = vis[0].length;
        int ctr = 0;
        for(int d = 0; d < dir.length; d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if(r >= 0 && c >= 0 && r < n && c < m && vis[r][c] != true){
                ctr += floodFill(r,c,er,ec,vis,dir,dirS,ans + dirS[d]);
            }
        }
        vis[sr][sc] = false;
        return ctr;
    // }

     public static int floodfill(int sr, int sc, int er, int ec, int[][] vis, int[][] dir, String ans){
        vis[sr][sc] = true;
        int ctr = 0;
        for(int d = 0; d < dir.length; d++){   
            if(r >= 0 && c >= 0 && r < vis.length && c < vis[0].length && vis[r][c] != true){
                ctr += floodFill(sr + dir[d][0], sc + dir[d][1],er,ec,vis,dir,dirS,ans + dirS[d]);
            }
        }
        vis[sr][sc] = false;
        return ctr;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int[][] dir = { {-1,0},{-1,-1}, {0,-1},{1,-1}, {1,0},{1,1}, {0,1},{-1,1}};
        String[] dirS = { "t", "l", "d", "r" };        
        int[][] vis = new int[n][m];
        floodFill(0,0,n-1,m-1,vis,dir,dirS,"");        
    }
}

//https://practice.geeksforgeeks.org/problems/special-matrix4201/1
//https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
//LC: 1219