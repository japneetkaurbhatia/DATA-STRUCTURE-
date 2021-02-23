#include <iostream>
using namespace std;

int minOfArray(int arr[], int idx, int n){
    // write your code here
    if(idx == n) return 1e9;
    return min(arr[idx], minOfArray(arr,idx+1,n));
}

int main(){
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    int p = minOfArray(arr, 0, n);
    cout << p << endl;
}
