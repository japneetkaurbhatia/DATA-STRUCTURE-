import java.util.*;

public class Main {
public static Scanner scn = new Scanner(System.in);
public static void print(int row){
    int nsp = row/2;
    int nst = 1;
    for(int r = 0; r < row; r++){
        for(int csp = 0; csp < nsp; csp++){
            if(r != (row/2)) System.out.print("\t");
            else System.out.print("*\t");
        }
        for(int cst = 0; cst < nst; cst++){
            System.out.print("*\t");
        }
        System.out.println();
        if(r < (row/2)) nst++;
        else nst--;
    }
}
    public static void main(String[] args) {
        
        // write ur code here
        int n = scn.nextInt();
        print(n);

    }
}
