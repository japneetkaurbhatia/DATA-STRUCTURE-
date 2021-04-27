#include<iostream>
#include<vector>
using namespace std;
bool isPalindrome(string str){    
int si = 0; 
int ei = str.length()-1;
while(si<ei){
    if(str[si++] != str[ei--]){
        return false;
    }
}
 return true;
}
void getAllSubstrings(string str){
     for (int i = 0; i < str.length(); i++) {
            for(int len = 1; i + len <= str.length(); len++){
                string s = str.substr(i, len);
                if(isPalindrome(s)){
                  cout<<s<<endl;
                }
            }
        }
    }
int main(){
    string str;
    cin>>str;
    getAllSubstrings(str);
    return 0;
}