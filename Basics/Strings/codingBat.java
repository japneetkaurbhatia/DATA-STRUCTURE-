// incorrect

// import java.util.Scanner;
// public class codingBat{
//     public static Scanner scn = new Scanner(System.in);
//     public static String withoutX2(String str){
//         if(str.length() == 0) return " ";
//         StringBuilder sb = new StringBuilder();
//         int i = 0;
//         while(i < str.length()){
//             if(i < 2){
//                 if(str.charAt(i)!='x')
//                 sb.append(str.charAt(i++));
//             }
//             else 
//                sb.append(str.charAt(i++));
//         }
//         return sb.toString();
//     }
//     public static void main(String[] args){
//         int t = scn.nextInt();
//         scn.nextLine();
//         while(t-- > 0){
//             String str = scn.nextLine();
//             System.out.println(withoutX2(str));
//         }
//     }
// }