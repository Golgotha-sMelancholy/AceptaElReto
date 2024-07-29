#include <iostream>

using namespace std;

// 595 - ¿En Qué Volumen? - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int loop = 0;
    cin >> loop;
    for(int i = 0; i<loop; i++) {
        int page = 0;
        cin >> page;
        cout << page/100 << endl;
    }

}
