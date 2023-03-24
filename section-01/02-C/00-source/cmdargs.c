#include <stdio.h>

int main(int argc, char* argv[]) {
    printf("Num args: %d\n", argc);
    for(int i = 0; i < argc; i++){
        printf("%s\n", argv[i]);
    }

    char* arr[10];
}