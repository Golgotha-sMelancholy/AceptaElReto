#include <stdio.h>
#include <stdlib.h>

// 621 - La Otra Página - Iván - https://github.com/wildfireOfMine

int main()
{
    int loop;
    scanf("%d", &loop);
    int i;
    int page;
    for (i = 0;i<loop; i++) {
        scanf("%d", &page);
        if (page % 2 == 0) {
            printf("%d\n", page+1);
        } else {
            printf("%d\n", page-1);
        }
    }
    return 0;
}
