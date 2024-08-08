#include <stdio.h>
#include <stdlib.h>

// 680 - La Carrera del Salmón - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
int main()
{
    int loop = 0;
    scanf("%d", &loop);
    int i;
    for (i = 0; i<loop; i++) {
        int counter = 1;
        int x = 0; int y = 0; int z = 0;
        scanf("%d", &x);
        scanf("%d", &y);
        scanf("%d", &z);
        if (z >= y && y<x) {
            printf("IMPOSIBLE\n");
        } else {
            int total = 0;
            while (total+y<x) {
                total += (y-z);
                counter++;
            }
            printf("%d\n", counter);
        }
    }
    return 0;
}
