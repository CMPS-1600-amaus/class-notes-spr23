#include <stdio.h>

int main(){
    int num = 10;
    int* ptr = &num;
    //printf("%p\n", ptr);
    //printf("%d\n", *ptr);

    long arr[10];
    arr[0] = 5;
    arr[1] = 4;
    printf("%p\n", arr);
    printf("%p\n", (arr+1));
    printf("%p\n", (arr+2));
    printf("%ld\n", *arr);
    printf("%ld\n", *(arr+1));
}