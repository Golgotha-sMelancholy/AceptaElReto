#include <iostream>

using namespace std;

// 216 - Goteras - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy

string time(int seconds){
    int second = 0;
    int minute = 0;
    int hour = 0;
    for (int i = 1; i<=seconds; i++) {
        second++;
        if (second % 60 == 0) {
            minute++;
            second = 0;
            if (minute % 60 == 0) {
                hour++;
                minute = 0;
            }
        }
    }
    string secondsString = "";
    string minutesString = "";
    string hourString = "";
    if (to_string(second).length() == 1) {
        secondsString = "0" + to_string(second);
    } else {
        secondsString = to_string(second);
    }
    if (to_string(minute).length() == 1) {
        minutesString = "0" + to_string(minute);
    } else {
        minutesString = to_string(minute);
    }
    if (to_string(hour).length() == 1) {
        hourString = "0" + to_string(hour);
    } else {
        hourString = to_string(hour);
    }
    string times = hourString + ":" + minutesString + ":" + secondsString;
    return times;
}

int main() {

    int loop = 0;
    cin >> loop;
    int seconds = 0;
    for (int i = 0; i<loop; i++) {
        cin >> seconds;
        cout << time(seconds) << endl;
    }
    return 0;
}
