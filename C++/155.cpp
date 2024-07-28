#include <iostream>

using namespace std;

// 155 - Perímetro de un Rectángulo - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int x = 0;
    int y = 0;
    cin >> x;
    cin >> y;
    while (x >= 0 && y >= 0) {
        cout << (x+y)*2 << endl;
        cin >> x;
        cin >> y;
    }
}
