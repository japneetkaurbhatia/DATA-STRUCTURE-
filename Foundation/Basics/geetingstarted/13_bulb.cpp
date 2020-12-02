#include<iostream>
using namespace std;


int bulb(int n)
{
    for(int i =1; i*i<=n ; i++)
    {
        cout<<i*i<<endl;
    }
    return 0;
}
int main(int argc, char**argv){
    int n;
    cin>>n;
    
    //write your code here
    bulb(n);
    return 0;
    
}