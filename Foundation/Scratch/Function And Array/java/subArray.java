import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void input(int[] arr,int n){
        for(int i=0; i <n; i++){
            arr[i] = scn.nextInt();
        }
    }
    /*public static void display(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }*/
    public static void subArrays(int[] a){
        int n = a.length;
        for(int k = 0;k <n;k++){
        for(int i = k; i < n; i++){
            for(int j = k; j<= i; j++){
                System.out.print(a[j]+"	");
            }
            System.out.println();
        }
        }
    } 

    public static void main(String[] args) throws Exception {
        // write your code here
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr,n);
        subArrays(arr);
    }

}
