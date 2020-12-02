#include <iostream>
using namespace std;

void RevNum(int n){
   // int ctr=0;
    int num = n;
    while(num){
        int res = num%10;
        cout<<res<<endl;
        num /= 10;
        }
}

int main(int argc, char **argv){
    int n;
    cin >> n;

    //write your code here
    RevNum(n);
    return 0;
}