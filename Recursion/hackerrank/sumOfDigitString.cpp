// https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-16sumofdigitinstring

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int sumOfDigit(string s,int i,int n){
    if(i >= n) return 0;
    int recAns = sumOfDigit(s,i+1,n);
    return recAns + (s[i] - '0');
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    string s;
    cin>>s;
    int n = s.length();
    cout<<sumOfDigit(s,0,n);
    return 0;
}
