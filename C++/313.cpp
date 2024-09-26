#include <iostream>

using namespace std;

// 313 - Fin de Mes - Iván - https://github.com/wildfireOfMine

int main()
{
    int loop = 0;
    cin >> loop;
    for (int i = 0; i<loop; i++) {
        int wage = 0;
        int change = 0;
        cin >> wage;
        cin >> change;
        if (wage+change < 0) {
            cout << "NO" << endl;
        } else {
            cout << "SI" << endl;
        }

    }
}
