#include<iostream>
using namespace std;
void Print_n_size(int n);
int main(){
    int n;
    cin>>n;
    Print_n_size(n);
    return 0;
}

void Print_n_size(int n)
{
    for(int r = 1; r <= n; r++)
    {
        for(int c = 1; c <=n; c++)
        {
            cout<<"*\t";
        }
        cout<<endl;
    }
}
