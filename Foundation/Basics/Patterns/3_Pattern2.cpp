#include <iostream>
using namespace std;

#include <iostream>
using namespace std;

void InvertedTriangle(int row)
{
    int nst = row;
    for(int r = 1;r<=row;r++)
    {
        for(int cst = 1; cst <= nst; cst++)
        {
            cout<<"*\t";
        }
        cout<<endl;
        nst--;
    }
    
}

int main(int argc, char **argv){
    int n;
    cin >> n;
    
   //write your code here
   InvertedTriangle(n);
   return 0;
   
}

