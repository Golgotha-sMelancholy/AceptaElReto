#include <iostream>

using namespace std;

// 380 - ¡Me Caso! - Iván - https://github.com/wildfireOfMine

int main()
{
    int loop = 0;
    cin >> loop;
    while (loop != 0) {
        int stock = 0;
        for (int i = 0; i<loop; i++){
            int input = 0;
            cin >> input;
            stock += input;
        }
        cout << stock << endl;
        cin >> loop;
    }
}
