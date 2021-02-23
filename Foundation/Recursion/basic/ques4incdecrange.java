import java.io.*;
import java.util.*;

public class ques3incdecrange {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // write your code here
        int a = scn.nextInt();
        int b = scn.nextInt();
        pdi(a,b);
    }

    public static void pdi(int a, int b){
        if(a==b+1)  return;
        System.out.println(a);
        pdi(a+1,b);
        System.out.println(a);
    }

}
