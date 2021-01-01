#include <iostream>
using namespace std;
int reverseNumber(int n){
    int ans=0,lastDigit=0;
    while(n){
        lastDigit = n%10;
        n /= 10;
         
       ans = ans * 10 + lastDigit;
       
    }
    return ans;
    
}

int main(int argc, char **argv){
    int n;
    cin >> n;
cout<<reverseNumber(n);
    //write your code here
    return 0;
}
