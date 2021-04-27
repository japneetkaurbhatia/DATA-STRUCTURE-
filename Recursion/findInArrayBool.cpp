#include <iostream>
using namespace std;

bool find(int arr[],int idx,int data, int n){
    if( idx == n ) return false;
    return (arr[idx] == data)? true : find(arr,idx+1,data,n);
}

int main(){
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    int d;
    cin>> d;
    bool p = find(arr,0,d,n);
    cout << (boolalpha) << p << endl;
}