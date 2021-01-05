import java.util.Scanner;
public class l002fibonaaci{
    public static Scanner scn = new Scanner(System.in);
    public static void fibonaaci(int n){
        int a = 0;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        n = n-2;
        while(n!=0){
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
            n--;
        }
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        fibonaaci(n);
    }
}

// import java.util.Scanner;
// public class Main{
//     public static Scanner scn = new Scanner(System.in);
//     public static void fibonaaci(int n){
//         int a = 0;
//         int b = 1;
//         int c;
//         System.out.println(a);
//         System.out.println(b);
//         n = n-2;
//         while(n!=0){
//             c = a + b;
//             a = b;
//             b = c;
//             System.out.println(c);
//             n--;
//         }
//     }
//     public static void main(String[] args){
//         int n = scn.nextInt();
//         fibonaaci(n);
//     }
// }
