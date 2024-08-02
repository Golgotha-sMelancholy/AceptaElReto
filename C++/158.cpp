#include <iostream>

using namespace std;

// 158 - Los Saltos de Mario - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int loop = 0;
    cin >> loop;
    for (int i = 0; i<loop; i++) {
        int subloop = 0;
        cin >> subloop;
        int input = 0;
        int aux = input;
        int high = 0;
        int low = 0;
        for (int j = 0; j<subloop; j++) {
            cin >> input;
            if (j >= 1) {
                if (input > aux) {
                    high++;
                } else if (input < aux) {
                low++;
                }
            }
            aux = input;
        }
        cout << high << " " << low << endl;
    }
    return 0;
}
