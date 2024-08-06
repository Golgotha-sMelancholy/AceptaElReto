#include <stdio.h>
#include <stdlib.h>

// 313 - Fin de Mes - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
int main()
{
    int loop;
    scanf("%d", &loop);
    int s = 0;
    int c = 0;
    int i;
    for (i = 0;i<loop; i++) {
        scanf("%d", &s);
        scanf("%d", &c);
        if (s+c>=0) {
            printf("SI\n");
        } else {
            printf("NO\n");
        }
    }
    return 0;
}
