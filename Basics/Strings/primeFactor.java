import java.util.Scanner;
import java.util.ArrayList;
public class primeFactor{
    public static Scanner scn = new Scanner(System.in);
    public static boolean isPrime(int n){
        for(int i = 2; i*i <= n; i++){
            if(n%i==0)
              return false;
        }
        return true;
    }
    public static void primeNumbers(int n,ArrayList<Integer> ans){
        for(int i = 2; i * i <= n; i++){
            if(isPrime(i)) ans.add(i);
        }
    }

    public static void primeFactors(int num,ArrayList<Integer> list){

        int idx = 0;
        while(num != 1 && idx < list.size()){
            int count = 0;
            while(num % list.get(idx) == 0){
                num /= list.get(idx);
                count++;
            }
            if(count > 0)
               System.out.print(list.get(idx) + "^" + count + " ");
            idx++;
        }
        
        if(num > 1)
            System.out.print(num + "^" + 1);
        
        System.out.println();
    }

    public static void primeFactorsForQuery(int[] query){
        ArrayList<Integer> list = new ArrayList<>();
        primeNumbers(10000,list);

        for(int ele : query){
            primeFactors(ele,list);
        }
    }
    // public static void primeNumbers(int n, ArrayList<Integer> ans){  //root n of root of root n , /n//n
    //     for(int i = 2; i*i <= n; i++){
    //         if(isPrime(i))
    //           ans.add(i);
    //     }
    // }
    // public static void primeFactors(int num, Arraylist<Integer> list){
    //     int idx = 0;
    //     while(num != 1 && idx < list.size()){
    //         int count = 0;
    //         while(num%list.get(idx)==0){
    //             num /= list.get(idx);
    //             count++;
    //         }
    //         if(count>0)
    //         System.out.println(list.get(idx) + "^" + count + " ");
    //         idx++;
    //     }
    //     if(num>1)
    //         System.out.println(num + "^" + 1 + " ");
    //         System.out.println();
    // }
    public static void primeFactorForQuery(int[] query){
        ArrayList<Integer> list = new ArrayList<>();
        // primeNumbers(150,list);
        primeNumbers(10000,list);
        // System.out.println(list);
        for(int ele : query){
            primeFactors(ele,list);        }
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        primeFactorForQuery(arr);
    }
}