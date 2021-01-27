#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
void input(vector<int>& arr){
    int n = arr.size();
    for(int i = 0; i<n; i++){
        cin>>arr[i];
    }
}
void targetSumPair(vector<int>& arr,int data, int si,int ei){
    sort(arr.begin(),arr.end());
    while(si<ei){
        //int mid = (si+ei)/2;
        int sum = arr[si]+arr[ei];
        if(sum > data) ei--;
        else if(sum<data)  si++;
        else{
            cout<<arr[si]<<", "<<arr[ei]<<endl;
            si++;
            ei--;
        }
    }
}
int main(){
    int n; cin>>n;
    vector<int> A(n,0);
    input(A);
    int target; cin>>target;
    targetSumPair(A,target,0,n-1);
    return 0;
}
