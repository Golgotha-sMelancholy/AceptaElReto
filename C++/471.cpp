#include <iostream>

using namespace std;

// 471 - Buscando el Pinchazo - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int loop = 0;
    cin >> loop;
    for (int i = 0; i<loop; i++) {
        int positionA = 0;
        int positionB = 0;
        cin >> positionA;
        cin >> positionB;
        if ((positionA - positionB - 360) % 360 < (positionB - positionA - 360) % 360) {
                cout << "DESCENDENTE" << endl;
            } else if ((positionA - positionB - 360) % 360 > (positionB - positionA - 360) % 360) {
                cout << "ASCENDENTE" << endl;
            } else {
                cout << "DA IGUAL" << endl;
            }
        }
}
