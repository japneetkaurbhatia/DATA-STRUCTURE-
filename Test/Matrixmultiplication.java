import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static Scanner scn = new Scanner(System.in);
    public static void input(int[][] arr, int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
    public static void multiplyMatrix(int[][] arr1, int[][] arr2, int[][] ans){
        int n = ans.length;
        int m = ans[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                ans[i][j] = 0;
                for(int k = 0; k < n; k++){
                    ans[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
    }
    public static void output(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr1 = new int[r][c];
        input(arr1,r,c);
        int[][] arr2 = new int[r][c];
        input(arr2,r,c);
        int[][] ans = new int[r][c];
        multiplyMatrix(arr1,arr2,ans);
        output(ans);
    }
}
