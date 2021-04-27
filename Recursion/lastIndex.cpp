#include <iostream>
using namespace std;

int lastIndex(int arr[], int idx, int data, int n){
    // write your code here
    if(idx == -1) return -1;
    if(arr[idx] == data) return idx;
    lastIndex(arr,idx-1,data,n);
}

int main(){
    int n;
    cin >> n;
    int d;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    cin >> d;
    int p = lastIndex(arr, n-1, d, n);
    cout << p << endl;
}