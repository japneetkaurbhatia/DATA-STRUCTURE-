import java.util.Scanner;
public class ques1{
    public static Scanner scn = new Scanner(System.in);
    public static void fun(int a){
        if(a>4)  return;
        a = a + 1;   
        return;
    }
    public static void fun1(){
        int a = 1;   
        System.out.println("Hi There" + a);
        fun(a);
        System.out.println(a);
    }
    public static void main(String[] args){
        fun1();
    }
}