#include <iostream>
using namespace std;

void PrintDiamond(int row)
{
    //int nst = 1;
    int i = 1,digit=1;
    int nsp = row/2;
    for(int r = 1;r<=row;r++)
    {
        for(int csp = 1; csp <= nsp; csp++)
        {
            cout<<"\t";
        }
        
        for(int cst = 1; cst <= i; cst++)
        {
            cout<<digit<<"\t";
        }
         
        if(r <= row/2)
        {
            nsp--; 
            i+=2;
            digit++;
        }
        else{
             nsp++;
             i-=2;
             digit--;
        }

         cout<<endl;
       
    }
    
}

int main(int argc, char **argv){
    int n;
    cin >> n;
    
   //write your code here
   PrintDiamond(n);
   return 0;
   
}

