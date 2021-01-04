import java.util.Scanner;
public class l001Func{
    public static Scanner scn = new Scanner(System.in);
    public static void add(int a, int b)
    {
      System.out.println(a+b);
    }
    public static void sub(int a, int b)
    {
      System.out.println(b-a);
    }
    public static void multiply(int a, int b)
    {
      System.out.println(a*b);
    }
    public static void divide(int a, int b)
    {
      System.out.println(b/a);
    }
    public static void main(String[] args)
    {
        int a = scn.nextInt();
        int b = scn.nextInt();
        add(a,b);
        sub(a,b);
        multiply(a,b);
        divide(a,b);
    }
}
