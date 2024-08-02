#include <iostream>

using namespace std;

// 456 - Tarta Sácher - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int loop = 0;
    cin >> loop;
    for (int i = 0; i<loop; i++) {
        int counter = 1;
        int n = 0;
        int m = 0;
        int r = 0;
        cin >> n;
        cin >> m;
        cin >> r;
        int nm = n*m;
        while (nm < r) {
            counter++;
            nm += n*m;
        }
        cout << counter << endl;
    }
    return 0;
}
