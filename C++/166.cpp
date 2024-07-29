#include <iostream>
#include <cstdlib>

using namespace std;

// 166 - Zapping - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int positionA = 0;
    int positionB = 0;
    cin >> positionA;
    cin >> positionB;
    while (positionA != 0 || positionB != 0) {
        if ((positionA - positionB - 99) % 99 < (positionB - positionA - 99) % 99) {
                cout << abs(((positionB - positionA - 99) % 99)) << endl;
            } else if ((positionA - positionB - 99) % 99 > (positionB - positionA - 99) % 99) {
                cout << abs(((positionA - positionB - 99) % 99)) << endl;
            } else {
                cout << "0" << endl;
            }
        cin >> positionA;
        cin >> positionB;
    }

}
