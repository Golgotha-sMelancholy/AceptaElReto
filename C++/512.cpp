#include <iostream>

using namespace std;

// 512 - Döner Sospechoso - Iván - https://github.com/wildfireOfMine

int main()
{
    int loop = 0;
    cin >> loop;
    for (int i = 0; i<loop; i++) {
        int kgRabbit = 0;
        int kgHorse = 0;
        cin >> kgRabbit;
        cin >> kgHorse;
        cout << (kgRabbit * 100) / (kgRabbit + kgHorse) << endl;
    }
}
