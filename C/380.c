#include <stdio.h>
#include <stdlib.h>

// 380 - ¡Me Caso! - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
int main()
{
    int loop;
    scanf("%d", &loop);
    while (loop != 0) {
        int i;
        int result = 0;
        for (i = 0; i<loop; i++) {
            int n = 0;
            scanf("%d", &n);
            result += n;
        }
        printf("%d\n", result);
        scanf("%d", &loop);
    }
    return 0;
}
