#include <iostream>

using namespace std;

// 114 - Último Dígito del Factorial - Iván - https://github.com/wildfireOfMine

int main()
{
    int loop = 0;
    cin >> loop;
    for (int i = 0; i<loop; i++) {
        int input = 0;
        cin >> input;
        if (input >= 5) {
            cout << "0" << endl;
        } else if (input == 4) {
            cout << "4" << endl;
        } else if (input == 3) {
            cout << "6" << endl;
        } else if (input == 2) {
            cout << "2" << endl;
        } else if (input <= 1) {
            cout << "1" << endl;
        }
    }

}
