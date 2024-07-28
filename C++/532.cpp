#include <iostream>

using namespace std;

// 532 - Reduciendo Envases - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int loop = 0;
    cin >> loop;
    for (int i = 0; i<loop; i++) {
        int weight = 0;
        int totalWeight = 0;
        cin >> weight;
        cin >> totalWeight;
        cout << totalWeight - weight << endl;
    }
}
