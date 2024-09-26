#include <stdio.h>
#include <stdlib.h>

// 369 - Contando en la Arena - Iván - https://github.com/wildfireOfMine

int main()
{
    int number = 0;
    scanf("%d", &number);
    while (number != 0) {
        int i;
        for (i = 0; i<number; i++) {
            printf("1");
        }
        printf("\n");
        scanf("%d", &number);
    }
    return 0;
}
