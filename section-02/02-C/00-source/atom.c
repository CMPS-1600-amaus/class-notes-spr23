#include <stdio.h>

typedef struct point3D {
    double x;
    double y;
    double z;
} point3D;

typedef struct atom {
    point3D coords;
    char name[2];
} atom;

int main(){
    point3D origin = {0, 0, 0};
    printf("%.2f %.2f %.2f\n", origin.x, origin.y, origin.z);

    atom he = {{0, 0, 0}, "he"};
}