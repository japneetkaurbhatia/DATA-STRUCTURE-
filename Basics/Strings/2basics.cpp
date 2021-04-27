#include<iostream>
using namespace std;
void test2(){
    string str = "";  
    for(int i = 0; i < (int)1e6; i++){
        str += to_string(i);
    }
    cout<<str<<endl;
}
int main(){
    test2();
    return 0;
}