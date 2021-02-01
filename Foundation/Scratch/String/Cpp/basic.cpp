#include<iostream>
#include<vector>
using namespace std;
bool isPalindrome(string str){    
int si = 0; 
int ei = sb.length()-1;
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
                cout<<str.substr(i, len)<<endl;
            }
        }
    }
int main(){
    return 0;
}
