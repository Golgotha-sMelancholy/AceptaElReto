#include <iostream>

using namespace std;
// 715 - ¿Hay Suficientes? - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{

    int loop = 0;
    cin >> loop;
    for(int i = 0; i<loop; i++) {
        int uvas = 0;
        int personas = 0;
        cin >> uvas;
        cin >> personas;
        if (uvas/personas>=12) {
            cout << "SI" << endl;
        } else {
            cout << "NO" << endl;
        }

    }

}
