#include <iostream>
using namespace std;
void print(int row){
    int nsp = row/2;
    int nst = 1;
    for(int r = 0; r < row; r++){
        for(int csp = 0; csp < nsp; csp++){
            if(r != (row/2)) cout<<("\t");
            else cout<<("*\t");
        }
        for(int cst = 0; cst < nst; cst++){
            cout<<("*\t");
        }
        cout<<endl;
        if(r < (row/2)) nst++;
        else nst--;
    }
}
int main(int agrc, char**argv){
    int n;
    cin >> n;
    print(n);

    //write your code here
    
}
