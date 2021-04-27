#include<iostream>
using namespace std;
void printDecreasing(int n){
    if(n==0)   return;
    cout<<"hi" << n<<endl;
    printDecreasing(n-1);
    printDecreasing(n-2);
    cout<<"bye" << n<<endl;
}
int main(){
    int n;
    cin>> n;
    printDecreasing(n);
    return 0;
}