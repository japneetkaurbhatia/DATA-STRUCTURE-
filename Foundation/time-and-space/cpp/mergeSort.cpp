#include<iostream>
#include<vector>
using namespace std;

void print(vector<int> arr) {
        for (int i = 0; i < arr.size(); i++) {
            cout<<arr[i] <<" ";
        }
        cout<<endl;
    }

    //used for merging two sorted arrays
    vector<int> mergeTwoSortedArrays(vector<int> a, vector<int> b) {
        cout<<"Merging these two arrays "<<endl;
        cout<<"left array -> ";
        print(a);
        cout<<"right array -> ";
        print(b);
        int i = 0, j = 0, k = 0;
        vector<int> ans(a.size() + b.size(),0);
        while (i < a.size() && j < b.size()) {
            if (a[i] <= b[j]) {
                ans[k] = a[i];
                i++;
                k++;
            } else {
                ans[k] = b[j];
                j++;
                k++;
            }
        }

        while (i < a.size()) {
            ans[k] = a[i];
            k++;
            i++;
        }

        while (j < b.size()) {
            ans[k] = b[j];
            k++;
            j++;
        }

        return ans;
    }

    
    vector<int> mergeSort(vector<int> arr, int si, int ei) {
        //write your code here
        if(si==ei){
            vector<int> base;
            base.push_back(arr[si]);
            return base;
        }
        int mid = (si+ei)/2;
        vector<int> A = mergeSort(arr,si,mid);
        vector<int> B = mergeSort(arr,mid+1,ei);

        return mergeTwoSortedArrays(A,B);
    }
    vector<int> mergeSort(vector<int> arr){
        return mergeSort(arr,0,arr.size()-1);
    }
    
    

    int main() {
        int n;
        cin>>n;
        vector<int> arr(n,0);
        for (int i = 0; i < n; i++) {
            cin>>arr[i];
        }
        vector<int> sa = mergeSort(arr, 0, arr.size() - 1);
        cout<<"Sorted Array -> ";
        print(sa);
    }

