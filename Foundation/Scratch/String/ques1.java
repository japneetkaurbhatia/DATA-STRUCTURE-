// ques:
// input: abaabbbccddeffghhh
// output: a1b1a2b3c2d2e1f2g1h3

public class ques1{
    public static String stringCompress(String str){
        if(str.length()==0) return "";
        StringBuilder sb = new StringBuilder();
        char prevChar = str.charAt(0);
        int i = 1;
        while(i <= str.length()){
            int count = 1;
            while(i < str.length() && prevChar == str.charAt(i)){
                count++;
                prevChar = str.charAt(i++);
            }
            sb.append(prevChar);
            sb.append(count);
            if(i==str.length())
               break;
            prevChar = str.charAt(i++);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "abaabbbccddeffghhh";
        System.out.println(stringCompress(str));
    }
}
