#include<iostream>
#include<vector>
using namespace std;
vector<string> appendCharInString(string str, char ch, vector<string>& ans){
	
	for(int i = 0; i <= str.length(); i++){
	    string s = str.substr(0,i-0+1) + ch + str.substr(i);
            ans.push_back(s);
	}
    return ans;
}

vector<string> permutation(string str){
    vector<string> ans;
        ans.push_back("");
        for(int i = 0; i < str.length(); i++){
            char ch = str[i];
            vector<string> smallAns;
            for(string s : ans){
                appendCharInString(s,ch,smallAns);
            }
            ans = smallAns;
        }
        return ans;
    }

	int main() {		
        string str = "abcd";
		cout<<permutation(str);
        return 0;
	}

