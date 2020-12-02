#include <iostream>
using namespace std;

void Fibo(int n)
{
    int a = 0;
    int b = 1;
    int c;
    cout<<a<<endl<<b<<endl;
    for(int i=0; i<n-2;i++)
    {
        c = a+b;
        a = b;
        b = c;
       
        cout<<b<<endl;
    }
    
}

int main(int argc, char **argv)
{
    int n;
    cin >> n;
    
    //write your code here
    Fibo(n);
}