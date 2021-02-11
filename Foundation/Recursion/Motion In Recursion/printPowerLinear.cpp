#include<iostream>
using namespace std;

int power(int x,int n){
   // write your code here
   return (n==0)? 1 : x*power(x,n-1);
}


int main(){
    int n,x; cin>>x>>n;
    cout<<power(x,n);
}
