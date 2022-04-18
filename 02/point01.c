#include <stdio.h>

int main() {
    int a = 10;
    //不行的，因为pa是地址，而a是一个具体的值
    //int *pa = a;
    int *pa = &a;
    printf("%p,%p\n",&a,pa);
    //*pa指的是获取pa这个地址中的存储的变量
    printf("%d,%d\n",*&a,*pa);
}
