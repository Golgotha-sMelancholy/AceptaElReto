#include <stdio.h>
#include <stdlib.h>

// 424 - Ahorro Infantil - Iván - https://github.com/wildfireOfMine

int main()
{
    int loop;
    scanf("%d", &loop);
    while (loop != 0) {
        int i;
        int result = 0;
        int maxResult = 0;
        for (i = 0; i<loop; i++) {
            int n = 0;
            scanf("%d", &n);
            result += n;
            if (result > maxResult) {
                maxResult = result;
            }
        }
        printf("%d %d\n", result, maxResult);
        scanf("%d", &loop);
    }
    return 0;
}
