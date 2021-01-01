#include <iostream>
using namespace std;

int gcd(int a,int b){
        int dividend = a;
        int divisor = b; 
        while(dividend%divisor != 0){
            int rem = dividend%divisor;
            dividend = divisor; 
            divisor = rem;
        }
        return divisor;
    }
    
int lcm(int a,int b, int g){
        return a*(b/g);
    }
int main(int argc, char **argv){
    int num1, num2;
    cin >> num1 >> num2;

    //write your code here
    int g = gcd(num1,num2);
    int l = lcm(num1,num2,g);
    cout<<g<<"\n"<<l<<endl;
}
