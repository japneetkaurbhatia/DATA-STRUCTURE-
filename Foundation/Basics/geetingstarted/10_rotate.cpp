#include <iostream>
#include<cmath>

using namespace std;

int CountDigit(int n)
    {
    int ctr=0;
    int num = n;
    while(num!=0)
    {
        num /= 10;
        ctr++;
    }
    return ctr;
   }  
   
int rotatenumber(int n,int r){
       int len = CountDigit(n);
       r %= len;
       if(r<0){
           r = (r+len)%len;
       }
       int mul=1;
       int div=1;
       for(int i =1;i<=len;i++){
           if(i<=r){
               div *= 10;
           }
           else{
               mul *= 10;
           }
       }
           
           int A = n % div;
           int B = n / div;
           
       return A * mul + B;
       
   }
int main(){
    int n,k;
    cin>>n>>k;
    
    //write your code here
    cout<<rotatenumber(n,k)<<endl;

}