#include <iostream>

using namespace std;
void print(int row) {
    int nst = row;
    int nsp = 0;
    for (int r = 0; r < row; r++) {
        for (int csp = 0; csp < nsp; csp++) {
            cout << ("\t");
        }
        for (int cst = 0; cst < nst; cst++) {
            cout << ("*\t");
        }
        for (int csp = 0; csp < nsp; csp++) {
            cout << ("\t");
        }
        cout << endl;
        if(r<(row/2))
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
