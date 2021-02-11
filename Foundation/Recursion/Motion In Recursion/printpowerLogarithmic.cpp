#include<iostream>
using namespace std;

int powerLogarithmic(int x,int n){
    // write your code here
     return (n==0)? 1 : x*powerLogarithmic(x,n-1);
    
}

int main(){
    int x,n; cin>>x>>n;
    cout<<powerLogarithmic(x,n);
}
