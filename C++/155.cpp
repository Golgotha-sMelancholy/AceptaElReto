#include <iostream>

using namespace std;

// 155 - Perímetro de un Rectángulo - Iván - https://github.com/wildfireOfMine

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
