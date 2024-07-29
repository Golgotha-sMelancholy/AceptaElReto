#include <iostream>

using namespace std;

// 680 - La Carrera de un Salmón - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int loop = 0;
    cin >> loop;
    for (int i = 0; i<loop; i++) {
        int counter = 1;
        int x = 0;
        int y = 0;
        int z = 0;
        cin >> x;
        cin >> y;
        cin >> z;
        if (z >= y && y<x) {
            cout << "IMPOSIBLE" << endl;
        } else {
            int total = 0;
            while (total+y<x) {
                total += (y-z);
                counter++;
            }
            cout << counter << endl;
        }

    }
}
