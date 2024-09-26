#include <stdio.h>
#include <stdlib.h>

// 434 - Romance en el Palomar - Iván - https://github.com/wildfireOfMine

int main()
{
    int loop;
    scanf("%d", &loop);
    int i;
    int dovesSleeping = 0;
    int ableBoxes = 0;
    for (i = 0; i<loop; i++) {
        scanf("%d", &dovesSleeping);
        scanf("%d", &ableBoxes);
        if (dovesSleeping>ableBoxes) {
            printf("PRINCIPIO\n");
        } else {
            printf("ROMANCE\n");
        }
    }
    return 0;
}
