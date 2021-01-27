#include<iostream>
#include<vector>
using namespace std;
void input(vector<int>& arr){
    int n = arr.size();
    for(int i = 0; i<n; i++){
        cin>>arr[i];
    }
}
void print(vector<int>& arr){
    int n = arr.size();
    for(int i = 0; i<n; i++){
        cout<<arr[i]<<endl;
    }
}
void countSort(vector<int>& arr,int minEle, int maxEle){
    vector<int> freqArray(maxEle-minEle+1,0);
    int shift = abs(minEle);
    for(int ele:arr){
        int freq = freqArray[ele-minEle]++;
    }
    int itr = 0;
    for(int i = 0;i<freqArray.size();i++){
        int freq = freqArray[i];
        while(freq-- > 0){
            arr[itr++] = i + minEle;
        }
    }
}
int main(){
    int n; cin>>n;
    vector<int> A(n,0);
    input(A);
    int minEle = 1e9;
    int maxEle = -1e9;
    for(int ele:A){
        minEle = min(minEle,ele);
        maxEle = max(maxEle,ele);
    }
    countSort(A,minEle,maxEle);
    print(A);
    return 0;
}
// time complexity : O((max-min)+n)
