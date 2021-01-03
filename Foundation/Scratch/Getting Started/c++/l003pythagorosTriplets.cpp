#include <iostream>
using namespace std;

int main(int argc, char **argv){
    int a,b,c;
    cin >> a >> b >> c;
    
    //write your code here
    bool ans =  (a*a == b*b + c*c || b*b == c*c + a*a ||c*c == a*a + b*b )?1:0;
    cout<<(boolalpha)<<ans<<endl;
    return 0;
    
}
