#include <iostream>

using namespace std;

// 219 - La Lotería de la Peña Atlética - Iván - https://github.com/wildfireOfMine

int main()
{
    int loop = 0;
    cin >> loop;
    for(int i = 0; i<loop; i++) {
        int counter = 0;
        int subloop = 0;
        cin >> subloop;
        for (int j = 0; j<subloop; j++) {
            int number = 0;
            cin >> number;
            if (number % 2 == 0){
                counter++;
            }
        }
        cout << counter << endl;
    }

}
