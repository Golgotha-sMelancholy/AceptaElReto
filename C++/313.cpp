#include <iostream>

using namespace std;

// 313 - Fin de Mes - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

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
