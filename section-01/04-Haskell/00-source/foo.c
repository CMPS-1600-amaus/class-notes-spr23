#include <stdio.h>
#include <pthread.h>
#include <stdlib.h>

int count = 0;

void* iterate(void* arg) {
    for(int i = 0; i < 1000000; i++){
        count++;
    }
    return NULL;
}

int main() {
    pthread_t p1;
    pthread_t p2;
    pthread_create(&p1, NULL, iterate, NULL);
    pthread_create(&p2, NULL, iterate, NULL);
    pthread_join(p1, NULL);
    pthread_join(p2, NULL);
    printf("Count: %d\n", count);
    return 0;
}