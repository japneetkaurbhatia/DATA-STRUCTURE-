#include <iostream>
#include <math.h>
using namespace std;

int DigitCount(int n)
{
    int num = n;
    int ctr =0;
        
    while(num){
        int res = num%10;
    ctr++;
        num /= 10;
        }
        return ctr;
}

void DigitofNum(int n)
{
   /* int len = DigitCount(n);
    for(int i = len; i >= 1; i--){
        int res = n%10;
        int ans = res*pow(10,i); 
        n /= 10;
        cout<<ans<<endl;
    }*/
    int A[len];

    
    
}


int main(int argc, char **argv){
    int n;
    cin >> n;

    //write your code here
    DigitofNum(n);
    return 0;
    
}
