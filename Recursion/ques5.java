import java.util.Scanner;
public class ques1{
    public static Scanner scn = new Scanner(System.in);
    public static void fun(int a){
        a = a + 1;   
    }
    public static void fun1(){
        int a = 1;   fun(a);
        System.out.println(a);
    }
    public static void main(String[] args){
        fun1();
    }
}