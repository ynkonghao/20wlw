#include <stdio.h>

void swap(int* a,int* b) {
    int z = *a;
    *a = *b;
    *b = z;
}

int main() {
    int a = 10;
    int b = 20;
    swap(&a,&b);
    printf("%d,%d",a,b);
}
