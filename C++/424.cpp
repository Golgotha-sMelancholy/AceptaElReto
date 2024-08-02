#include <iostream>

using namespace std;

// 424 - Ahorro Infantil - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int loop = 0;
    cin >> loop;
    while (loop != 0) {
        int input = 0;
        int money = 0;
        int maxMoney = 0;
        for (int i = 0; i<loop; i++) {
            cin >> input;
            money += input;
            if (money > maxMoney) {
                maxMoney = money;
            }
        }
        cout << money << " " << maxMoney << endl;
        cin >> loop;
    }
    return 0;
}
