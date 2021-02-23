#include<iostream>
using namespace std;
int eulearFunc(int n){
    if(n<=1){
        cout<<"Base Case : " + to_string(n)<<endl;
        return n;
    }
    int count = 0;
    cout<<"Pre : " + to_string(n)<<endl;
    count += eulearFunc(n-1);
    cout<<"In : " + to_string(n)<<endl;
    count += eulearFunc(n-2);
    cout<<"Post : " + to_string(n)<<endl;
    return count+3;
}
int main(){
    int n; cin>>n;
    cout<<eulearFunc(n)<<endl;
    return 0;
}
