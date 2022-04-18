#include <stdio.h>

int main() {
    int n = 99;
    //n++ --> n = n+1 ==>n变成42
    //++n --> n = n+1 ==>n还是42
    //int z = n++;//z是41,而n是42，先赋值，再自加
    //int z = ++n;//z是42,n也是42，先自加再赋值
    //if(n++>41) {}  int z = n++ z>41
    //n-- --> n = n-1

    int i;
    int flag = 1;
    for(i=2;i<n;i++) {
        if(n%i==0) {
            flag = 0;
            break;
        }
    }

    if(flag) {
        printf("%d是质数",n);
    } else {
        printf("%d不是质数",n);
    }

}
