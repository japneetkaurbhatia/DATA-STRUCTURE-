import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2) {
        // write your code here
        int borrow = 0, p = 1,res=0;
        while(n1!=0 || n2!=0){
            int sum = 0;
            sum = (n2%10  + borrow) - n1%10;
            n1 /= 10;
            n2 /= 10;
            if(sum < 0){
                sum += b;
                borrow = -1;
            }
            else{
                borrow = 0;
            }

            
            res += sum*p;
            p *= 10;
        }
        return res;
    }

}
