#include <stdio.h>
#include <stdlib.h>

// 217 - ¿Qué Lado de la Calle? - Iván - https://github.com/wildfireOfMine

int main()
{
    int number = 0;
    scanf("%d", &number);
    while (number != 0) {
       if (number % 2 == 0) {
            printf("DERECHA\n");
       } else {
            printf("IZQUIERDA\n");
       }

       scanf("%d", &number);
    }
    return 0;
}
