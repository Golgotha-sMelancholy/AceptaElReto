#include <iostream>

using namespace std;

// 434 - Romance en el Palomar - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int loop = 0;
    cin >> loop;
    for (int i = 0; i<loop; i++) {
        int pigeon = 0;
        int dove = 0;
        cin >> pigeon;
        cin >> dove;
        if(pigeon>dove){
            cout << "PRINCIPIO" << endl;
        } else {
            cout << "ROMANCE" << endl;
        }

    }
}
