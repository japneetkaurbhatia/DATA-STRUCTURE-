#include <iostream>
using namespace std;
void fibonacci(int n){
        int a = 0;
        int b = 1;
        int c;
        cout<<a<<endl<<b<<endl;
        n = n-2;
        while(n)
        {
            c = a+b;
            a = b;
            b = c;
            n--;
            cout<<b<<endl;
        }
    }

int main(int argc, char **argv)
{
    int n;
    cin >> n;
    fibonacci(n);
    //write your code here
    

    
}
