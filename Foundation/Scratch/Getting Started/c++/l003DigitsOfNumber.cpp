#include <iostream>
using namespace std;

int countDigit(int n){
    int ctr=0;
    while(n){
     int r = n%10;
     ctr++;
     n /= 10;
    }
    return ctr;
}
void digitOfNumber(int n){
   int len = countDigit(n);
   int div = 1;
   while(len>1){
       div = div*10;
       len--;
   }
   while(div){
       cout<<n/div<<endl;
       n %= div;
       div /= 10;
   }
}

int main(int argc, char **argv){
    int n;
    cin >> n;

    //write your code here
    digitOfNumber(n);
    return 0;
    
}
