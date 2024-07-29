#include <iostream>

using namespace std;

// 663 - Contando desde el Cero - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int loop = 0;
    cin >> loop;
    for(int i = 0; i<loop; i++) {
        int year = 0;
        cin >> year;
        if (year > 0) {
            year--;
        }
        cout << year << endl;
    }

}
