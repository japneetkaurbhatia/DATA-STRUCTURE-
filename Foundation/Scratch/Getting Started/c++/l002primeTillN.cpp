#include <iostream>
using namespace std;
bool isPrime(int n)
{
    for(int i = 2; i*i <= n; i++){
        if(n%i==0){
          return false;
        }
    }
    return true;
 
}

void primenum(int l, int h){
  
      for(int i =l; i<=h; i++)
    {
       
        if(isPrime(i)){
            cout<<i<<endl;
        }
       
    }
}
int main(int argc, char **argv){
    int low, high;
    cin >> low >> high;
primenum(low,high);
    //write your code here

}
