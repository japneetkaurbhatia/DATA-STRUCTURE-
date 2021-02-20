//ques : Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. 
//       This is a little harder than it looks.


//withoutX2("xHi") → "Hi"
//withoutX2("Hxi") → "Hi"
//withoutX2("Hi") → "Hi"

//link : https://codingbat.com/prob/p151359

import java.util.Scanner;
public class codingBat{
    public static Scanner scn = new Scanner(System.in);
    public static String withoutX2(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < str.length(); i++){
            if(i < 2 && str.charAt(i)!='x'){
                sb.append(str.charAt(i));
            }
            if(i >= 2)
               sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        int t = scn.nextInt();
        scn.nextLine();
        while(t-- > 0){
            String str = scn.nextLine();
            System.out.println(withoutX2(str));
        }
    }
}
