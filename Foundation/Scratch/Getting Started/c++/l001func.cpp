#include<iostream>
using namespace std;
void add(int a, int b)
{
    cout<<a+b<<endl;
}
void sub(int a, int b)
{
    cout<<b-a<<endl;
}
void multiply(int a, int b)
{
    cout<<a*b<<endl;
}
void divide(int a, int b)
{
    cout<<b/a<<endl;
}
int main()
{
    int a,b;
    cin>>a>>b;
    add(a,b);
    sub(a,b);
    multiply(a,b);
    divide(a,b);
    return 0;
}
