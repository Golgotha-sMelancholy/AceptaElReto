#include <iostream>

using namespace std;

// 481 - Ajedrez Asistido por Computador - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int square = 0;
    int number = 0;
    cin >> square;
    cin >> number;
    while (square != 0 || number != 0) {
        switch (square){
        case 8:
            cout << "a" << "";
            break;
        case 7:
            cout << "b" << "";
            break;
        case 6:
            cout << "c" << "";
            break;
        case 5:
            cout << "d" << "";
            break;
        case 4:
            cout << "e" << "";
            break;
        case 3:
            cout << "f" << "";
            break;
        case 2:
            cout << "g" << "";
            break;
        case 1:
            cout << "h" << "";
            break;
        }
        cout << number << endl;
        cin >> square;
        cin >> number;
    }
}
