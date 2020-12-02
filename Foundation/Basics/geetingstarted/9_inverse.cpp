#include <iostream>
#include <math.h>
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

int inverse(int n)
{
    int num = n;
    int len = CountDigit(num);
    for(int i =1;i <= len; i++){
        int digit = num%10;
        num /= 10;
        int sum += i*pow(10,digit-1);
    }
    return sum;
}

int main(int argc, char **argv){
    int n;
    cin >> n;

    //write your code here
    cout<<inverse(n)<<endl;
    return 0;
    
}