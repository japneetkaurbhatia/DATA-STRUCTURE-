// bool isPrime(int n)
// {
//     for(int i = 2; i*i < n; i++){
//         if(n%i){
//           return false;
//           break;}
//     }
//     return true;
// }

// void primenum(){
//     int t,n ;
//     cin>> t;
//     for(int i =1; i<=t; i++)
//     {
//         cin>>n;
//         if(isPrime(n)){
//             cout<<"prime";
//         }
//         else{
//             cout<<"not prime";
//         }
//     }
// }

#include <iostream>
using namespace std;
bool isPrime(int n)
{
    for(int i = 2; i*i <= n; i++){
        if(n%i==0){
          return false;
        }
    }
    return true;
}

void primenum(){
    int t,n ;
    cin>> t;
    for(int i =1; i<=t; i++)
    {
        cin>>n;
        if(isPrime(n)){
            cout<<"prime"<<endl;
        }
        else{
            cout<<"not prime"<<endl;
        }
    }
}
int main(int argc, char **argv){
    primenum();

    //write your code here
    
}
