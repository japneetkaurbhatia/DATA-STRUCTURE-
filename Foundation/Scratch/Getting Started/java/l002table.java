import java.util.Scanner;
public class l002table{
    public static Scanner scn = new Scanner(System.in);
    public static void tableOfN(int n)
    {
        for(int i = 1; i<=10; i++)
        {
            System.out.println(n+"X"+i+"="+ n*i);
        }
    }
    public static void main(String[] args)
    {
        int of_n = scn.nextInt();
        tableOfN(of_n);
    }
}
