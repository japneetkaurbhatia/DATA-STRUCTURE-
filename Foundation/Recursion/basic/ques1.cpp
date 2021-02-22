#include<iostream>
using namespace std;
int printDecreasing(int n){
    if(n==0)   return 0;
    cout<<"hi" << n<<endl;
    printDecreasing(n-1);
    cout<<"bye" << n<<endl;
}
int main(){
    int n;
    cin>> n;
    printDecreasing(n);
    return 0;
}
