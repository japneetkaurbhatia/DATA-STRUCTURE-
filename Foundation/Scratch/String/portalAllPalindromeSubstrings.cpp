#include<iostream>
using namespace std;
bool palindrome(string str){
    int i = 0, j = str.length()-1;
    while(i<j){
        if(str[i++]!=str[j--])  return false;
    }
    return true;
}
void printSubstring(string str){
    for(int i = 0; i < str.length(); i++){
        for(int len = 1; i + len <= str.length(); len++){
            string s = str.substr(i,len);
            if(palindrome(s))  cout<<s<<endl;
        }
    }
}
int main(){
    string str;
    cin>> str;
    printSubstring(str);
    return 0;
}
