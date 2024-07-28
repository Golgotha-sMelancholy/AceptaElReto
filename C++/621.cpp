#include <iostream>

using namespace std;

// 621 - La Otra Página - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int main()
{
    int loop = 0;
    cin >> loop;
    for (int i = 0; i<loop; i++){
        int page = 0;
        cin >> page;
        if (page%2==0) {
            cout << page+1 << endl;
        } else {
            cout << page-1 << endl;
        }
    }
}
