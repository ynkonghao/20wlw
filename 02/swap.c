#include <stdio.h>

void swap1(int a, int b) {
    int z = a;
    a = b;
    b = z;
    printf("swap:a=%d,b=%d\n",a,b);
}

void swap2(int nums[]) {
    int z = nums[0];
    nums[0] = nums[1];
    nums[1] = z;
    printf("swap2:n1=%d,n2=%d\n",nums[0],nums[1]);
}

int main() {
    /*int a = 10;
    int b = 20;
    swap1(a,b);
    printf("main:a=%d,b=%d\n",a,b);*/

    int nums[2] = {12,22};
    swap2(nums);
    printf("main:n1=%d,n2=%d\n",nums[0],nums[1]);
}
