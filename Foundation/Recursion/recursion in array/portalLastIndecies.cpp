#include <iostream>
using namespace std;

int lastIndex(int arr[], int idx, int data, int n){
    // write your code here
    if(idx == n) return -1;
    int ans = lastIndex(arr,idx+1,data,n);
    if(ans != -1) return ans;
    
    return arr[idx] == data ? idx : -1;
}

int main(){
    int n;
    cin >> n;
    int d;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    cin >> d;
    int p = lastIndex(arr, 0, d, n);
    cout << p << endl;
}
