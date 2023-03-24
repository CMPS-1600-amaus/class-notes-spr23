#include <stdio.h>
#include <stdlib.h>

int main(int argc, char* argv[]) {
    char* arr[10];
    arr[0] = (char*)malloc(20*sizeof(char));
    arr[1] = (char*)malloc(20*sizeof(char));
    //arr[0] = "abcasdfasasdasdfasdfadsfdfasdgasdfgasfdasdasdfabcasdfasdfasdgasdfgasfdasdasdfabcasdfasdfasdgasdfgasfdasdasdfabcasdfasdfasdgasdfgasfdasdasdfabcasdfasdfasdgasdfgasfdasdasdfabcasdfasdfasdgasdfgasfdasdasdf";
    //arr[1] = "def";

    scanf("%s", arr[0]);
    scanf("%s", arr[1]);
    printf("%p\n", arr[0]);
    printf("%p\n", arr[1]);
    printf("%s\n", arr[0]);
    printf("%s\n", arr[1]);
    printf("%p\n", arr[0]);

    free(arr[0]);
    free(arr[1]);
}