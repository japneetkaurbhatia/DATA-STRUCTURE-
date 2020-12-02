#include <iostream>
using namespace std;

void PrintHollowDiamond(int row)
{
    int nst = (row+1)/2;
    int nsp = 1;
    for(int r = 1;r<=row;r++)
    {
        for(int cst = 1; cst <= nst; cst++)
        {
            cout<<"*\t";
        }
        for(int csp = 1; csp <= nsp; csp++)
        {
            cout<<"\t";
        }

        for(int cst = 1; cst <= nst; cst++)
        {
            cout<<"*\t";
        }
        
        
         
        if(r <= row/2)
        {
            nsp+=2; 
            nst--;
        }
        else{
             nsp-=2;
             nst++;
        }

         cout<<endl;
       
    }
    
}

int main(int argc, char **argv){
    int n;
    cin >> n;
    
   //write your code here
   PrintHollowDiamond(n);
   return 0;
   
}

