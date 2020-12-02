/*#include <iostream>
using namespace std;

void Triangle(int row)
{
    int nst = 1;
    for(int r = 1;r<=row;r++)
    {
        for(int cst = 1; cst <= nst; cst++)
        {
            cout<<"*";
        }
        cout<<endl;
        nst++;
    }
    
}

int main(int argc, char **argv){
    int n;
    cin >> n;
    
   //write your code here
   Triangle(n);
   return 0;
   
}*/

#include <iostream>
using namespace std;

void Triangle(int row)
{
    int nst = 1;
    for(int r = 1;r<=row;r++)
    {
        for(int cst = 1; cst <= nst; cst++)
        {
            cout<<"*\t";
        }
        cout<<endl;
        nst++;
    }
    
}

int main(int argc, char **argv){
    int n;
    cin >> n;
    
   //write your code here
   Triangle(n);
   return 0;
   
}