#include <iostream>

using namespace std;

// 616 - Pic, poc, pic... Pong! - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main() {

    int loop = 0;
    cin >> loop;
    while (loop != 0) {
        string picpoc = "";
        int points = 0;
        int right = 0;
        int left = 0;
        for (int i = 0; i<loop; i++) {
            cin >> picpoc;
            if (picpoc == "PIC") {
                points++;
            } else if (picpoc == "PONG!") {
                if (points % 2 == 0) {
                    left++;
                } else {
                    right++;
                }
            }
        }
        cout << left << " " << right << endl;
        cin >> loop;
    }
    return 0;
}
