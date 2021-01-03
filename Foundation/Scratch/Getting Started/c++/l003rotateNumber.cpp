#include <iostream>
#include<cmath>

using namespace std;
int countDigit(int n){
    int ctr = 0;
    while(n!=0){
        int rem = n%10;
        ctr++;
        n /= 10;
    }
    return ctr;
}
int rotateNumber(int n, int r){
    int len = countDigit(n);
    r = (r%len+len)%len;
    int mul = 1;
    int div = 1;
    for(int i=1; i<=len; i++){
        if(i<=r){
            div *= 10;
        }
        else{
            mul *= 10;
        }
    }
    int a = n%div;
    int b = n/div;
    return a*mul+b;
}
int main(){
    int n,k;
    cin>>n>>k;
    
    //write your code here
    cout<<rotateNumber(n,k);
    return 0;

}
