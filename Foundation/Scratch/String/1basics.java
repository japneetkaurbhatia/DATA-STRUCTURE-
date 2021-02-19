public class basics{
    public static void test1(){
        String str = "abcde";  //O(n)
        String str1 = str;    //O(1)
        str += 'g';    //O(n)
        char ch = str.charAt(3);
        System.out.println(str);
    } 
    public static void test3(){
        StringBuilder sb = new StringBuilder();
        sb.append('d');   //O(1)
        StringBuilder sb1 = sb;    //O(1)
        StringBuilder sb2 = new StringBuilder(sb);     //O(n)
        char ch = sb.charAt(0);
        System.out.println(sb.toString());   //O(n)
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        test1();
        test3();
    }
}
