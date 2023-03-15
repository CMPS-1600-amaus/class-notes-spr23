#include <stdio.h>

void generateTwinPrimes(int maxVal) {
    for(int num = 6; num < maxVal; num +=6){
        printf("%d\n", num);
    }
}

int main(){
    int maxVal = -1;
    printf("Enter max val: ");
    scanf("%d", &maxVal);
    printf("maxVal: %d\n", maxVal);
    generateTwinPrimes(maxVal);
}