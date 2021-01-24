import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static int findEle(int[] arr, int data){
        int flag = -1;
        for(int i=0; i < arr.length; i++){
            if(arr[i]==data){
               flag = i;
            }
        }
        return flag;        
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        int n = scn.nextInt();
        int[] arr = new int[n];
        int data = scn.nextInt();
        System.out.println(findEle(arr,data));
    }

}
