public class L003PythagorosTriplets{

public static void main(String[] args){
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    
    
    //write your code here
    boolean ans =  (a*a == b*b + c*c || b*b == c*c + a*a ||c*c == a*a + b*b )?1:0;
    System.out.println(ans);
    
}
}
