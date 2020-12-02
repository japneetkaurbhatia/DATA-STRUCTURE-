#include <iostream>
using namespace std;

#include <iostream>
using namespace std;

#include <iostream>
using namespace std;

void InvertedMirrorTriangle(int row)
{
    int nsp = 0;
    int nst = row;
    for(int r = 1;r<=row;r++)
    {
        for(int csp = 1; csp <= nsp; csp++)
        {
            cout<<"\t";
        }
        for(int cst = 1; cst <= nst; cst++)
        {
            cout<<"*\t";
        }
        cout<<endl;
        nsp++;
        nst--;
    }
    
}

int main(int argc, char **argv){
    int n;
    cin >> n;
    
   //write your code here
   InvertedMirrorTriangle(n);
   return 0;
   
}

