#include <iostream>

using namespace std;

// 751 - Coetáneos - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

int years(int firstStart, int firstEnd, int secondStart, int secondEnd) {
    int difference = 0;
    for (int i = firstStart; i<=firstEnd; i++) {
        if (i<=secondEnd && i>=secondStart){
            difference++;
        }

    }
    return difference;
}

int main()
{
    int loop = 0;
    cin >> loop;
    for (int i = 0; i<loop; i++){
        int firstYearStart = 0;
        int firstYearEnd = 0;
        cin >> firstYearStart;
        cin >> firstYearEnd;
        int secondYearStart = 0;
        int secondYearEnd = 0;
        cin >> secondYearStart;
        cin >> secondYearEnd;
        cout << years(firstYearStart, firstYearEnd, secondYearStart, secondYearEnd) << endl;

    }
}
