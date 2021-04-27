import java.util.Scanner;
public class codingBatSir{
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