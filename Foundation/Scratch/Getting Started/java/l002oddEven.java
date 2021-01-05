import java.util.Scanner;
public class l002oddEven{
    public static Scanner scn = new Scanner(System.in);
    public static void checkEvenOdd(int n){
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void run(int t){
        while(t-->0){
            int no = scn.nextInt();
            checkEvenOdd(no);
        }
    }
    public static void main(String[] args)
    {
        int cases = scn.nextInt();
        run(cases);
    }
}
