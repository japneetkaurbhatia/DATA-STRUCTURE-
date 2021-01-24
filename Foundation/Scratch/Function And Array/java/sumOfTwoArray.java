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
        for(int i=0; i < arr.length; i++){
            if(i==0 && arr[i] == 0) continue;
            System.out.println(arr[i]);
        }
    }
    public static void sumOfArrays(int[] a, int[] b){
        int n = a.length, m = b.length;
        int[] ans = new int[Math.max(n,m)+1];
        int i = n-1, j = m-1, k = ans.length-1, carry = 0;
        while(k>=0){
            int sum = carry;
            if(i>=0) sum+=a[i--];
            if(j>=0) sum+=b[j--];
            ans[k--] = sum%10;
            carry = sum/10;
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
        sumOfArrays(arr1,arr2);
    }

}
