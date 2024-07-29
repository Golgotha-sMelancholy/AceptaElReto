#include <iostream>

using namespace std;

// 217 - ¿Qué Lado de la Calle? - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int number = 0;
    cin >> number;
    while (number != 0) {
        if (number % 2 == 0) {
            cout << "DERECHA" << endl;
        } else {
            cout << "IZQUIERDA" << endl;
        }
        cin >> number;
        
    }
}
