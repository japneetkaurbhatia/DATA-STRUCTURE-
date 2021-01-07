import java.util.Scanner;
public class l002tabletillm{
    public static Scanner scn = new Scanner(System.in);
    public static void tableOfN(int n)
    {
        for(int i = 1; i<=10; i++)
        {
            System.out.println(n+"X"+i+"="+ n*i);
        }
    }
    public static void tabletillm(int m){
    for(int i = 1; i<=m; i++){
       tableOfN(i);
       System.out.println();
}   }
    public static void main(String[] args)
    {
        int till_m = scn.nextInt();
        tabletillm(till_m);
    }
}
