#include <stdio.h>

int main(){
    int arr[10];
    arr[0] = 5;
    arr[1] = 4;
    //char* str = "Hello WOrld!";
    //printf("%p\n",str);
    printf("%p\n",arr);  
    printf("%d\n",*(arr+1));
}