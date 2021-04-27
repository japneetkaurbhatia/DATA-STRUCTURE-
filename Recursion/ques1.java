import java.util.Scanner;
public class ques1{
    public static Scanner scn = new Scanner(System.in);
    public static void printDecreasing(int n){
        if(n==0)   return;
        System.out.println("hi" + n);
        printDecreasing(n-1);
        System.out.println("bye" + n);
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        printDecreasing(n);
    }
}