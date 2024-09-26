#include <iostream>
#include <cctype>

using namespace std;

// 300 - Palabras Pentavólicas - Iván - https://github.com/wildfireOfMine

bool pentavocalic(string str) {
    bool a = false;
    bool e = false;
    bool i = false;
    bool o = false;
    bool u = false;
    for (int j = 0; j<str.length(); j++) {
        if (str[j] == 'a') {
            a = true;
        } else if (str[j] == 'e'){
            e = true;
        } else if (str[j] == 'i'){
            i = true;
        } else if (str[j] == 'o') {
            o = true;
        } else if (str[j] == 'u') {
            u = true;
        }
    }

    return a && e && i && o && u;
}

int main()
{
    int loop = 0;
    cin >> loop;
    for (int i = 0; i<loop; i++) {
        string phrase = "";
        cin >> phrase;
        if (pentavocalic(phrase)) {
            cout << "SI" << endl;
        } else {
            cout << "NO" << endl;
        }
    }
    return 0;
}
