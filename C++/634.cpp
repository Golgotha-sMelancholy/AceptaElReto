#include <iostream>

using namespace std;

// 634 - Bandurria Hero - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int loop = 0;
    cin >> loop;
    string chords = "";

    for (int i = 0; i<loop; i++) {
        cin >> chords;
        int bonus = 1;
        int combo = 10;
        int points = 0;
        for (int j = 0; j<chords.length(); j++) {
            if (chords[j] == 'O') {
                points += combo * bonus;
                bonus++;
            } else {
                bonus = 1;
            }
        }
        cout << points << endl;
    }
    return 0;
}
