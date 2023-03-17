#include <stdio.h>

int main(){
    // create an array of 10 ints
    char arr[1];
    // this array will always only be able to hold 10 ints

    /*for(int i = 0; i < 10; i++){
        printf("arr[%d]: %c\n", i, arr[i]);
    }*/

    int* num;
    int var;
    printf("*num: %p\n", num);
    printf("*var: %p\n", &var);

    // dereference num
    //*num = 10; // store 10 at the memory location stored in num
    printf("num: %d\n", *num);
}