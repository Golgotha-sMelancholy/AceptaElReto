#include <iostream>

using namespace std;

int main()
{
  // 116 - Hola Mundo - Iván - https://github.com/wildfireOfMine
    int bucle = 0;
    string soy = "";
    string nombre = "";
    cin >> bucle;
    for(int i=0; i<bucle; i++) {
        cin >> soy;
        cin >> nombre;
        cout << "Hola, " + nombre + "." << endl;
    }
}
