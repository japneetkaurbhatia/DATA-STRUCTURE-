#include<iostream>
using namespace std;
void checkEvenOdd(int n){
        if(n%2==0){
            cout<< to_string(n) + "-> Even"<<endl;
        }
        else{
            cout<<to_string(n) + "-> Odd"<<endl;
        }
    }
void run(int t){
        while(t--){
            int no; cin>>no;
            checkEvenOdd(no);
        }
    }
int main()
    {
        int cases; cin>>cases;
        run(cases);
    }
