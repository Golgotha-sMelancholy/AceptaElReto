#include <stdio.h>
#include <stdlib.h>

// 715 - ¿Hay Suficientes? - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
int main()
{
    int loop;
    scanf("%d", &loop);
    int i;
    int grapes = 0;
    int people = 0;
    for (i = 0; i<loop; i++) {
        scanf("%d", &grapes);
        scanf("%d", &people);
        if (grapes/people>=12) {
            printf("SI\n");
        } else {
            printf("NO\n");
        }
    }
    return 0;
}
