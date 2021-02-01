public class l001{
    public static boolean isPalindrome(String str){
        int si = 0; 
        int ei = sb.length()-1;
        while(si<=ei){
            if(str.charAt(si++) != str.charAt(ei--)){
                return false;
            }
        }
        return true;
    }
    public static void getAllSubstrings(String str){
        // int len = str.length();
        // int si = 0;
        // while (si <= len) {
        //     for (int i = si + 1; i <= len; i++) {
        //         System.out.println(str.substring(si, i));
        //     }
        //     si++;
        // }       
        for (int i = 0; i < str.length(); i++) {
            for(int len = 1; i + len <= str.length(); len++){
                System.out.println(str.substring(i, i + len));
            }
        }
    }
    public static void main(String[] args){

    }
}
