#include<iostream>
#include<vector>

using namespace std;

int BinarySearch(vector<int>& arr,int data)
{
    int si = 0;
    int ei = arr.size()-1;
    int mid;
    int ceil = 1e8;
    int floor = -1e8;
    while(si<=ei)
    {
        
        mid = (si + ei)/2;
        if(arr[mid]==data)
        {
            ceil = arr[mid];
            floor = arr[mid];
        }
        else if(arr[mid]>data)
        {
            ei = mid-1;
            ceil = arr[mid];
        }
        else{
            si = mid+1;
            floor = arr[mid];
        }
        
    }
    cout<<ceil<<endl;
    cout<<floor<<endl;
    
    return 0;
}

int main()
{
    int n;
    cin>>n;
    vector<int> arr(n);
    
    for(int i = 0; i<arr.size(); i++)
    {
        cin>>arr[i];
    }
    int data;
    cin>>data;
    BinarySearch(arr,data);
    return 0;
}
