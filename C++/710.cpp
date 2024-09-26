#include <iostream>

using namespace std;

// 710 - Plazas Disponibles en el Mundial - Iván - https://github.com/wildfireOfMine

int main()
{
    int loop = 0;
    cin >> loop;
    for(int i = 0; i<loop; i++) {
        int teams = 0;
        int europe = 0;
        int asia = 0;
        int africa = 0;
        int northAmerica = 0;
        int southAmerica = 0;
        int oceania = 0;
        cin >> teams;
        cin >> europe;
        cin >> asia;
        cin >> africa;
        cin >> northAmerica;
        cin >> southAmerica;
        cin >> oceania;
        cout << teams-europe-asia-africa-northAmerica-southAmerica-oceania << endl;

    }

}
