import java.util.Scanner;

public class Main {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void moveToLast(int[] arr, int si, int ei) {
        for (int j = si + 1; j < ei; j++) {
            if (arr[j - 1] > arr[j]) {
                swap(arr, j - 1, j);
            }
        }
    }

    public static void bubble(int arr[], int n) {

        //Write your code here.
        for (int i = 0; i < n - 1; i++) {
            moveToLast(arr, 0, n - i);

        }


    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }

        bubble(ar, n);
        for (int val: ar)
            System.out.print(val + " ");
    }

}
