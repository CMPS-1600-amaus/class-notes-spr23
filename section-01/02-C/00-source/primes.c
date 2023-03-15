#include <stdio.h>

int isPrime(int num) {
    
}

void generateTwinPrimes(int maxVal) {
    for(int num = 6; num <= maxVal; num+=6){
        if(isPrime(num-1) && isPrime(num+1)){
            printf("%d-%d\n", num-1, num+1);
        }
    }
}

int main() {
    int maxVal = -1;
    printf("Enter a max val: ");
    scanf("%d", &maxVal);
    printf("maxVal: %d\n", maxVal);
    //printf("address of maxVal: %p\n", &maxVal);
    generateTwinPrimes(maxVal);
}