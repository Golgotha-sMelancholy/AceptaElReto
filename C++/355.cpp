#include <iostream>

using namespace std;

// 355 - Gregorio XIII - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int loop = 0;
    cin >> loop;
    for (int i = 0; i<loop; i++) {
        int year = 0;
        cin >> year;
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            cout << "29" << endl;
        } else {
            cout << "28" << endl;
        }

    }
}
