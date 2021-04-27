#include <iostream>
using namespace std;

int find(int arr[],int idx,int data, int n){
    if( idx == n ) return -1;
    return (arr[idx] == data)? idx : find(arr,idx+1,data,n);
}

int main(){
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    int d;
    cin>> d;
    int p = find(arr,0,d,n);
    cout << p << endl;
}