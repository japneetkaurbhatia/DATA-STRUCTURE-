import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void input(int[] arr,int n){
        for(int i=0; i <n; i++){
            arr[i] = scn.nextInt();
        }
    }
    public static void display(int[] arr){
        boolean flag = false;
        for(int i=0; i < arr.length; i++){
            if(!flag && arr[i] == 0) continue;
            flag = true;
            System.out.println(arr[i]);
        }
    }
    public static void subOfArrays(int[] a, int[] b){
        int n = a.length, m = b.length;
        int[] ans = new int[Math.max(n,m)];
        int i = n-1, j = m-1, k = ans.length-1, borrow = 0;
        while(k>=0){
            int sum = borrow;
            if(j>=0) sum+=b[j--];
            if(i>=0) sum-=a[i--];
            if(sum<0){
                sum+= 10;
                borrow = -1;
            }
            else{
                borrow = 0;
            }
            ans[k--]=sum;
        }
        display(ans);
    } 

    public static void main(String[] args) throws Exception {
        // write your code here
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        input(arr1,n1);
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        input(arr2,n2);
        subOfArrays(arr1,arr2);
    }

}
