#include <iostream>
using namespace std;
void reverseNumber(int n){
    int ans=0,lastDigit=0;
    while(n){
        lastDigit = n%10;
        n /= 10;
         cout<<lastDigit<<endl;
       // ans = ans * 10 + lastDigit;
       
    }
    
}

int main(int argc, char **argv){
    int n;
    cin >> n;
reverseNumber(n);
    //write your code here
    return 0;
}
