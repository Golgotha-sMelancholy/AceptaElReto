#include <iostream>

using namespace std;

// 682 - Metidos en un Cajón - Iván - https://github.com/wildfireOfMine

int main()
{
    int loop = 0;
    cin >> loop;
    for (int i = 0; i<loop; i++) {
        int peak = 0;
        int legs = 0;
        cin >> peak;
        legs = peak*2;
        cout << peak << " " << legs<< endl;

    }
}
