// ques:
// input: abaabbbccddeffghhh
// output: a1b1a2b3c2d2e1f2g1h3

#include<iostream>
using namespace std;
string stringCompress(string str){
        if(str.length()==0) return "";
        string sb = "";
        char prevChar = str[0];
        int i = 1;
        while(i <= str.length()){
            int count = 1;
            while(i < str.length() && prevChar == str[i]){
                count++;
                prevChar = str[i++];
            }
            sb.push_back(prevChar);
            sb += to_string(count);
            if(i==str.length())
               break;
            prevChar = str[i++];
        }
        return sb;
    }
int main(){
    string str = "abaabbbccddeffghhh";
    cout<<stringCompress(str);
    return 0;
}
