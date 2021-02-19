public class basics{
    public static void test2(){
    String str = "";  
    for(int i = 0; i < (int)1e9; i++){
        str += i;
    }
     System.out.println(str); //O(n2)
}
public static void test4(){
    StringBuilder str = new StringBuilder();  
    for(int i = 0; i < (int)1e9; i++){
        str.append(i);  //O(n)
    }
     System.out.println(str);
}
    public static void main(String[] args){
        test2();
        test4();
    }
}
