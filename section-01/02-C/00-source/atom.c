#include <stdio.h>

typedef struct point3D {
    double x;
    double y;
    double z;
} point3D;

int main(){
    point3D origin = {0, 0, 0};
    printf("%0.2f %0.2f %0.2f\n", origin.x, origin.y, origin.z);
}