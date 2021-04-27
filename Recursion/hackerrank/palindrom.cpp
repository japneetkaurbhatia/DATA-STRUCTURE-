//https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-11palindrome/submissions/code/1330958084

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

bool isPalin(vector<int>& arr,int si,int ei){
    if(si >= ei) return true;
    if(arr[si] != arr[ei])  return false;
    return isPalin(arr,si+1,ei-1);
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>> n;
    vector<int> arr(n,0);
    for(int i = 0; i < n; i++)  cin>>arr[i];
    cout<<boolalpha<<isPalin(arr,0,n-1);
    return 0;
}
