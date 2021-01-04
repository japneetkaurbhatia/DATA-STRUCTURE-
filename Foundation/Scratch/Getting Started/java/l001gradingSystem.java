import java.util.Scanner;
public class l001gradingSystem{
    public static Scanner scn = new Scanner(System.in);
    public static void gradingSystem(int m)
    {
        if(m > 90)
            System.out.println("excellent");
        else if(m > 80)
            System.out.println("good");
        else if(m > 70)
            System.out.println("fair");
        else if(m > 60)
            System.out.println("meets expectations");
        else
            System.out.println("below par");
    }
    public static void main(String[] args)
    {
        int marks = scn.nextInt();
        gradingSystem(marks);
    }
}
