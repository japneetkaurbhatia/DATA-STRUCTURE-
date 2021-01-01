#include<iostream>
using namespace std;
int countDigit(int n){
        int ctr = 0;
        while(n!=0){
            n /= 10;
            ctr++;
        }
        return ctr;
    }
int main(){
        int n; cin>>n; 
        cout<<("Hello")<<endl;
        cout<<countDigit(n)<<endl;
    }
