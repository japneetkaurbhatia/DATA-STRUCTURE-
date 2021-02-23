#include<iostream>
using namespace std;

int firstIndex(int arr[], int idx, int data, int n){
    // write your code here
    if(idx == n) return -1;
    if(arr[idx] == data) return idx;
    firstIndex(arr,idx+1,data,n);
}

int main()
{
    int n;
    cin >> n;
    int d;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    cin >> d;
    int p = firstIndex(arr, 0, d, n);
    cout << p << endl;
}
