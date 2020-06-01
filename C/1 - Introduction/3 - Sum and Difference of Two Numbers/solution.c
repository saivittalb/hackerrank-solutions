#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main(void)
{
	int a, b;
    float c, d;
    int e,f;
    float g,h;
    scanf("%i%i", &a, &b);
    scanf("%f%f", &c, &d);
    e = a + b;
    f = a - b;
    g = c + d;
    h = c - d;
    printf("%i %i\n%.1f %.1f", e, f, g, h);
    return 0;
}
