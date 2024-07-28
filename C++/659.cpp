#include <iostream>

using namespace std;

// 659 - Números Jeroglíficos - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int number = 0;
    cin >> number;
    while (number != 0) {
        string hieroglyphic = "";
        while (number >= 1000000) {
                hieroglyphic += 'H';
                number -= 1000000;
            }
            while (number >= 100000) {
                hieroglyphic += 'R';
                number -= 100000;
            }
            while (number >= 10000) {
                hieroglyphic += 'D';
                number -= 10000;
            }
            while (number >= 1000) {
                hieroglyphic += 'F';
                number -= 1000;
            }
            while (number >= 100) {
                hieroglyphic += 'C';
                number -= 100;
            }
            while (number >= 10) {
                hieroglyphic += 'G';
                number -= 10;
            }
            while (number >= 1) {
                hieroglyphic += 'T';
                number -= 1;
            }
        cout << hieroglyphic << endl;
        cin >> number;
    }
}
