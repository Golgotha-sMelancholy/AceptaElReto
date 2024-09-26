#include <iostream>

using namespace std;

// 538 - Toesto era Campo - Iván - https://github.com/wildfireOfMine

int main()
{

    int anoYoNaci = 0;
    int anoIglesia = 0;
    cin >> anoYoNaci;
    cin >> anoIglesia;
    while (anoYoNaci != 0 || anoIglesia != 0) {
        if (anoYoNaci>=anoIglesia) {
            cout << "CUERDO" << endl;
        } else {
            cout << "SENIL" << endl;
        }
        cin >> anoYoNaci;
        cin >> anoIglesia;
    }
    return 0;

}
