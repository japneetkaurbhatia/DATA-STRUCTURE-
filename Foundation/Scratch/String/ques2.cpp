// ques:
// input: abaabbbccddeffghhh
// output: a3b4c2d2e1f2g1h3

#include<iostream>
#include<vector>
using namespace std;
string stringCompress(string str){
        vector<int> freq(26,0);
        for(int i = 0; i < str.length(); i++){
            freq[str[i] - 'a']++;
        }
        string st = "";
        for(int i = 0; i < freq.size(); i++){
            if(freq[i] > 0){
                st += (i+'a');
                st += to_string(freq[i]);
            }
        }
        return st;
    }
int main(){
    string str = "abaabbbccddeffghhh";
    cout<<stringCompress(str);
    return 0;
}
