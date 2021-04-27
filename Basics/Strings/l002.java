import java.util.Scanner;
public class l002{
    public static Scanner scn = new Scanner(System.in);
    public static boolean palindrome(String str){
        int i = 0, j = str.length()-1;
        while(i < j){
            if(str.charAt(i++)!=str.charAt(j--))
               return false;
        }
        return true;
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        System.out.println(palindrome(str));
    }
}