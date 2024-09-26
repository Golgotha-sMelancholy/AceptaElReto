#include <iostream>

using namespace std;

// 427 - Yo Soy Tu... - Iván - https://github.com/wildfireOfMine

int main()
{
    int loop = 0;
    cin >> loop;
    for(int i = 0; i<loop; i++) {
        string luke = "";
        string father = "";
        cin >> luke;
        cin >> father;
        if (luke == "Luke" && father == "padre") {
            cout << "TOP SECRET" << endl;
        } else {
        cout << luke + ", yo soy tu " + father << endl;
        }
    }

}
