#include <stdio.h>
#include <stdlib.h>

// 114 - Último Dígito del Factorial - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
int main()
{
    int loop = 0;
    scanf("%d", &loop);
    int i;
    for (i = 0; i<loop; i++) {
        int input = 0;
        scanf("%d", &input);
        if (input >= 5) {
            printf("0\n");
        } else if (input == 4) {
            printf("4\n");
        } else if (input == 3) {
            printf("6\n");
        } else if (input == 2) {
            printf("2\n");
        } else if (input == 1 || input == 0) {
            printf("1\n");
        }
    }
    return 0;
}
