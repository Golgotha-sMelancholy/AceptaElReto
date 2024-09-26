#include <iostream>

using namespace std;

// 757 - Toques de Balón - Iván - https://github.com/wildfireOfMine

int main()
{
    int loop = 0;
    cin >> loop;
    for (int i = 0; i<loop; i++) {
        string headbutts = "";
        cin >> headbutts;
        int counter = 0;
        int maxCounter = 0;
        for (int j = 0; j<headbutts.length(); j++) {
            if (headbutts[j] == 'S') {
                counter = 0;
            } else {
                counter++;
                if (counter > maxCounter) {
                    maxCounter = counter;
                }
            }
        }
        cout << maxCounter << endl;
    }

}
