#include<iostream>
using namespace std;
void tableOfN(int n){
    for(int i = 1; i<=10; i++){
        cout<<to_string(n)+"X"+to_string(i)+"="+to_string(n*i)<<endl;
}   }
int main(){
    int of_n;    cin>>of_n;
    tableOfN(of_n);
    return 0;    }
