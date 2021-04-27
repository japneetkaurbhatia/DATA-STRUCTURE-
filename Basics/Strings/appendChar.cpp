#include<iostream>
#include<vector>
using namespace std;
vector<string> appendCharInString(string str, char ch){
	vector<string> ans;
	for(int i = 0; i <= str.length(); i++){
	    string s = str.substr(0,i-0+1) + ch + str.substr(i);
            ans.push_back(s);
	}
    return ans;
}

int main() {		
	cout<<appendCharInString("abcde",'f');
}