import java.util.Scanner;
public class ques3{
    public static Scanner scn = new Scanner(System.in);
    public static void fun(int n){
        if(n==0){
            System.out.println("i have to stop " + n);
            return;
        }

        for(int i = 0; i < 3; i++) System.out.print(n + "@" + i);
        System.out.println();

        if (n%2==0) System.out.println("heading toward child function " + n);
        fun(n-1);
        if(n%2 != 0) System.out.println("back to parent function " + n);      
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        fun(n);
    }
}
