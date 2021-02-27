import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        int n = 5;
        printPattern(1,1,n);
    }

    public static void printPattern(int cst,int nor,int n){
        if(nor==n+1) return;
        if(cst == nor+1){
            System.out.println();
            printPattern(1,nor+1,n);
            return;
        }
        System.out.print("*\t");
        printPattern(cst+1,nor,n);
    }

}
