import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static boolean isPrime(int n)
{
    for(int i = 2; i*i <= n; i++){
        if(n%i==0){
          return false;
        }
    }
    return true;
 
}

public static void primenum(int l, int h){
  
      for(int i =l; i<=h; i++)
    {
       
        if(isPrime(i)){
            System.out.println(i);
        }
       
    }
}

    public static void main(String[] args) {
        int low = scn.nextInt();
        int high = scn.nextInt();
primenum(low,high);
        // write ur code here

    }
}
