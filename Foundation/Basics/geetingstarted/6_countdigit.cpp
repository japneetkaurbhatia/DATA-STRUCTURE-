#include <iostream>
using namespace std;

int CountDigit(int n)
{
    int ctr=0;
    int num = n;
    while(num!=0)
    {
        num /= 10;
        ctr++;
    }
    return ctr;
}

int main(int argc, char **argv){
    int n;
    cin >> n;
    
    //write your code here
    cout<<CountDigit(n)<<endl;
}