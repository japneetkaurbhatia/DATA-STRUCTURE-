#include <iostream>
using namespace std;

bool PythagoreanTriplet(int a,int b,int c)
{
   if(a*a == b*b + c*c || b*b == c*c + a*a ||c*c == a*a + b*b ) 
      return true;
   
   return false;
}
   /* {
        cout<<"true";
    }
    else
    {
        cout<<"false";
    }*/


int main(int argc, char **argv){
    int a,b,c;
    cin >> a >> b >> c;
    
    //write your code here
    cout<<(boolalpha)<<PythagoreanTriplet(a,b,c)<<endl;
    return 0;
}
