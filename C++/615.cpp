#include <iostream>

using namespace std;

// 615 - La Pulga - Iván - https://github.com/wildfireOfMine

int main()
{
    int loop = 0;
    cin >> loop;
    for (int i = 0; i<loop; i++) {
        int space = 0;
        int power = 0;
        int pressedKey = 0;
        cin >> space;
        cin >> power;
        cin >> pressedKey;
        space++;
        cout << (pressedKey%space) * power << endl;
    }
}
