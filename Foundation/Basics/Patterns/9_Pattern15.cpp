#include <iostream>
using namespace std;

void PrintDiamond(int row)
{
    int nsp = row/2;
    int nd = 1;
    int digit=1;
    while(digit <= row){
    for(int r = 1; r <= row; r++)
    {
        
        for(int csp = 1; csp <= nsp; csp++)
        {
            cout<<"\t";
        }
        for(int cd = 1; cd <= nd; cd++)
        {
            cout<<digit<<"\t";
            digit++;
        }
        cout<<endl;
        nsp--;
        nd++;
    }        
    }
    digit--;
} 


int main(int argc, char **argv){
    int n;
    cin >> n;
    
   //write your code here
   PrintDiamond(n);
   return 0;
   
}

