#include <stdio.h>
#include <stdlib.h>

// 659 - Números Jeroglíficos - Iván - https://github.com/wildfireOfMine

int main()
{
    int number = 0;
    scanf("%d", &number);
    while (number != 0) {
        while (number >= 1000000) {
            number -= 1000000;
            printf("H");
        }
        while (number >= 100000) {
            number -= 100000;
            printf("R");
        }
        while (number >= 10000) {
            number -= 10000;
            printf("D");
        }
        while (number >= 1000) {
            number -= 1000;
            printf("F");
        }
        while (number >= 100) {
            number -= 100;
            printf("C");
        }
        while (number >= 10) {
            number -= 10;
            printf("G");
        }
        while (number >= 1) {
            number -= 1;
            printf("T");
        }

        printf("\n");
        scanf("%d", &number);
    }
    return 0;
}
