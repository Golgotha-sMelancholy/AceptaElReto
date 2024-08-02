#include <iostream>

using namespace std;

// 608 - Peligro por Hielo - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int loop = 0;
    cin >> loop;
    while (loop != 0) {
        int degrees = 0;
        bool frozen = false;
        int alarm = 0;
        for (int i = 0; i<loop; i++) {
            cin >> degrees;
            if (!frozen && degrees <= 4) {
                alarm++;
                frozen = true;
            } else if (frozen && degrees > 6) {
                frozen = false;
            }
        }
        cout << alarm << endl;
        cin >> loop;
    }
    return 0;
}
