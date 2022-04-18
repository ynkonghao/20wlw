#include <stdio.h>

int main() {
    int a = 10;
    int b = a;
    b = 20;
    //a = ?

    int a1 = 10;
    int *b1 = &a1;
    *b1 = 20;
    //a1=?
    printf("%d,%d\n",a,a1);
}
