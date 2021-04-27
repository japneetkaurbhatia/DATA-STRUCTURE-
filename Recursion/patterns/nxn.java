import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        printPattern(1,5,1,5,5);
    }

    public static void printPattern(int cst,int nst,int nor,int n,int m){
        if(nor==n+1) return;
        if(cst == nst+1){
            System.out.println();
            printPattern(1,nst,nor+1,n,m);
            return;
        }
        System.out.print("*\t");
        printPattern(cst+1,nst,nor,n,m);
    }

}