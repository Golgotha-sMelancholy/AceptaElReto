#include <stdio.h>
#include <stdlib.h>

// 615 - La Pulga - Iván - https://github.com/wildfireOfMine

int main()
{
    int loop;
    scanf("%d", &loop);
    int i;
    int n = 0;
    int f = 0;
    int t = 0 ;
    for (i = 0;i<loop; i++) {
        scanf("%d", &n);
        scanf("%d", &f);
        scanf("%d", &t);
        n++;
        int result = (t%n)*f;
        printf("%d\n", result);
    }
    return 0;
}
