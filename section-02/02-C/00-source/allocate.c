#include <stdio.h>
#include <stdlib.h>

int main() {
    char* arr[10];
    //arr[0] = "asdfasfasd";
    arr[0] = (char*)malloc(4090*sizeof(char));
    //scanf("%s", arr[0]);
    arr[1] = (char*)malloc(2*sizeof(char));
    scanf("%s", arr[0]);
    printf("%s\n", arr[0]);
    printf("%s\n", arr[1]);
    printf("arr[0]: %p\n", arr[0]);
    printf("arr[1]: %p\n", arr[1]);

    int num = 10;
    //printf("&num: %p\n", &num);

    free(arr[0]);
    free(arr[1]);
}