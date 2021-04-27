#include<iostream>
using namespace std;

string withoutX2(string str){
    string ans = "";
    for(int i = 0;i < str.length(); i++){
        if(i < 2 && str[i]!='x'){
            ans += str[i];
        }
        if(i >= 2){
            ans += str[i];
        }
    }
    return ans;
}
int main(){
    int t;   cin>>t;
    while(t--){
        string str; cin>>str;
        cout<<(withoutX2(str))<<endl;
        }
}