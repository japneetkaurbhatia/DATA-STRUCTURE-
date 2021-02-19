// ques:
// input: abaabbbccddeffghhh
// output: a3b4c2d2e1f2g1h3

public class ques2{
    public static String stringCompress(String str){
        int[] freq = new int[26];
        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 0){
                sb.append((char)(i+'a'));
                sb.append(freq[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "abaabbbccddeffghhh";
        System.out.println(stringCompress(str));
    }
}
