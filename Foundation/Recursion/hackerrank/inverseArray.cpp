//  https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-13inversearray
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void inverseArray(vector<int>& arr, int i,int n){
    if(i >= n)  return;
    int val = arr[i];
    inverseArray(arr,i+1,n);
    arr[val] = i;
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>> n;
    vector<int> arr(n,0);
    for(int i = 0; i < n; i++)  cin>>arr[i];
    int idx;  cin>>idx;
    inverseArray(arr,0,n);
    for(int i = 0; i < n; i++)  cout<<arr[i]<<" ";
    cout<<endl;
    cout<<arr[idx];
    return 0;
}
