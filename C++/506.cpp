#include <iostream>

using namespace std;

// 506 - Tensión Descompensada - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int loop = 0;
    cin >> loop;
    for (int i = 0; i<loop; i++) {
        int a = 0;
        char division = ' ';
        int b = 0;
        cin >> a;
        cin >> division;
        cin >> b;
        if (a < b) {
            cout << "MAL" << endl;
        } else {
            cout << "BIEN" << endl;
        }
    }
}
