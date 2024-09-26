#include <iostream>

using namespace std;

// 369 - Contando en la Arena - Iván - https://github.com/wildfireOfMine

int main()
{

    int numero = 0;
    cin >> numero;
    while (numero != 0) {
        for(int i = 0; i<numero; i++) {
            cout << "1" << "";
        }
        cout << "\n" << "";
        cin >> numero;
    }

}
