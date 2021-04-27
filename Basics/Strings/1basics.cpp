#include<iostream>
using namespace std;
void test1(){
    string str = "abcde";  //O(n)
    str += 'f';    //O(1)
    str.push_back('g');    //O(1)
    cout<<str<<endl;
    string str1 = str;   //O(n)
    str1 += 'p';    //O(1)
    str = str +'p';     //O(n)
    char ch = str[4];
    cout<<str<<" "<<str1<<endl;    //O(n)
}
int main(){
    string str;
    cin>>str;
    test1();
    return 0;
}