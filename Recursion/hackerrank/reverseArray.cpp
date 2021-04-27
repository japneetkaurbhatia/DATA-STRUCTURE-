// https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-12reverseofarray/submissions/code/1330958237

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void reverseArray(vector<int>& arr, int si, int ei){
    if(si>=ei) return;
    swap(arr[si],arr[ei]);
    reverseArray(arr,si+1,ei-1);
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n;
    cin>> n;
    vector<int> arr(n,0);
    for(int i = 0; i < n; i++)  cin>>arr[i];
    int idx;  cin>>idx;
    reverseArray(arr,0,n-1);
    for(int i = 0; i < n; i++)  cout<<arr[i]<<" ";
    cout<<endl;
    cout<<arr[idx];
    return 0;
}
