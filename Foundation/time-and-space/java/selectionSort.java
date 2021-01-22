import java.io.*;
import java.util.*;

public class Main {
    
    public static int moveToLast(int[] arr, int si, int ei) {
        int smallidx = si;
        for (int j = si + 1; j <= ei; j++) {
            if (isSmaller(arr, j, smallidx)) {
                smallidx = j;
            }
        }
        return smallidx;
    }



    public static void selectionSort(int[] arr) {
        //write your code here
        int ei = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            int idx = moveToLast(arr, i, ei);
            swap(arr, i, idx);

        }
    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // return true if ith element is smaller than jth element
    public static boolean isSmaller(int[] arr, int i, int j) {
        System.out.println("Comparing " + arr[i] + " and " + arr[j]);
        if (arr[i] < arr[j]) {
            return true;
        } else {
            return false;
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        selectionSort(arr);
        print(arr);
    }

}
/*OUPUT
Comparing -2 and 7
Comparing 4 and -2
Comparing 1 and -2
Comparing 3 and -2
Swapping 7 and -2
Comparing 4 and 7
Comparing 1 and 4
Comparing 3 and 1
Swapping 7 and 1
Comparing 7 and 4
Comparing 3 and 4
Swapping 4 and 3
Comparing 4 and 7
Swapping 7 and 4
-2
1
3
4
7

*/
