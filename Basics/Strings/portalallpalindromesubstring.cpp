#include<iostream>
using namespace std;
bool palindrome(string str){
        int i = 0,j = str.length()-1;
        while(i < j){
            if(str[i++] != str[j--])
               return false;
        }
        return true;
    }

void solution(string str){
	//write your code here
	for(int i = 0; i < str.length(); i++){
	    for(int j = i; j < str.length();j++){
	        string s = str.substr(i,j-i+1);
		    if(palindrome(s))
		       cout<<s<<endl;
	      }
	}
}

int main() {
		string str;
		cin>>str;
		solution(str);
		return 0;
	}