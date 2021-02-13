#include<iostream>
#include<vector>
using namespace std;
int maxOfArray(vector<int>& arr, int idx, int n){
    if(idx == arr.size()-1) return -1e9;
    return max(arr[idx],maxOfArray(arr,idx+1,n));
}
int main(){
    int n;   cin>>n;
    vector<int> arr(n,0);
    for(int i = 0; i < n; i++)  cin>>arr[i];
    cout<<maxOfArray(arr,0,n);
    return 0;
    
}
