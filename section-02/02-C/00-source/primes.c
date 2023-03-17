#include <stdio.h>
#include <math.h>

int isPrime(num){
    for(int i = 2; i < (int)sqrt(num)+1; i++){
        if(num % i == 0){
            return 0;
        }
    }
    return 1;
}

void generateTwinPrimes(int maxVal) {
    for(int num = 6; num < maxVal; num +=6){
        if(isPrime(num-1) && isPrime(num+1)){
            printf("%d-%d\n", num-1, num+1);
        }
    }
}

int main(){
    int maxVal = -1;
    printf("Enter max val: ");
    scanf("%d", &maxVal);
    printf("maxVal: %d\n", maxVal);
    printf("maxVal: %p\n", &maxVal);
    generateTwinPrimes(maxVal);
}