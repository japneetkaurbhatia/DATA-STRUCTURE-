// ques : Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
//        This is a little harder than it looks.
// link : https://github.com/japneetbhatia/DATA-STRUCTURE-/new/main/Foundation/Scratch/String 


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"

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
