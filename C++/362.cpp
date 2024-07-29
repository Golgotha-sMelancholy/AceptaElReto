#include <iostream>

using namespace std;

// 362 - El Día de Navidad - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int number = 0;
    cin >> number;
    for (int i = 0; i<number; i++) {
        int day = 0;
        int month = 0;
        cin >> day;
        cin >> month;
        if (day == 25 && month == 12) {
            cout << "SI" << endl;
        } else {
            cout << "NO" << endl;
        }

    }
}
