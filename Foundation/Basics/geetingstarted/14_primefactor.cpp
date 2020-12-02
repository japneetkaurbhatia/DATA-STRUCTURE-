/*#include <iostream>
using namespace std;


int primefactor(int n) {
    int quotient,ans;
    while (n != 1) {
        int divisor = 2;
        while (n % divisor == 0) {
            int quotient = n % divisor;
            ans *= quotient;
            n = quotient;
        }
        divisor++;
    }
    return ans;

}

int main(int argc, char ** argv) {
    int n;
    cin >> n;

    //write your code here
    cout << primefactor(n) << endl;

}*/

