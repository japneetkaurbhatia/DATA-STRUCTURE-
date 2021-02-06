#include <iostream>

using namespace std;
void print(int row) {
    int nst = row;
    int nsp = 0;
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < nsp; j++) {
            cout << ("\t");
        }
        for (int j = 0; j < nst; j++) {
            cout << ("*\t");
        }
        cout << endl;
        if(i<(row/2))
        {
            nsp++;
            nst -= 2;
        }
        else{
            nsp--;
            nst +=2;
        }
    }
}
int main(int agrc, char ** argv) {
    int n;
    cin >> n;
    print(n);

    //write your code here

}
/*
output 
*	*	*	*	*	*	*	
	*	*	*	*	*		
		*	*	*			
			*				
		*	*	*			
	*	*	*	*	*		
*	*	*	*	*	*	*	

*/
