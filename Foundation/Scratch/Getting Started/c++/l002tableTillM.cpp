#include<iostream>
using namespace std;
void tableOfN(int n){
    for(int i = 1; i<=10; i++){
        cout<<to_string(n)+"X"+to_string(i)+"="+to_string(n*i)<<endl;
}   }
void tabletillm(int m){
    for(int i = 1; i<=m; i++){
       tableOfN(i);
       cout<<endl;
}   }
int main(){
    int till_m;    cin>>till_m;
    tabletillm(till_m);
    return 0;    }
