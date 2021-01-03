#include <iostream>
#include <math.h>
using namespace std;
int countDigit(int n){
    int ctr=0,rem;
    while(n){
        rem = n%10;
        ctr++;
        n /= 10;
    }
    return ctr;
}

int inverse(int n){
    int len = countDigit(n);
    int ans = 0;
    for(int i = 1; i <= len; i++){
        int r = n%10;
        n /= 10;
        ans += i*pow(10,(r-1));
    }
    return ans;
}

int main(int argc, char **argv){
    int n;
    cin >> n;

    //write your code here
    cout<<inverse(n);
    
}
