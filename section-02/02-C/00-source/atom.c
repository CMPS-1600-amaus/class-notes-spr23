#include <stdio.h>
#include <stdlib.h>

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

    point3D* a = (point3D*)malloc(sizeof(point3D));
    a->x = 1;
    a->y = 1;
    a->z = 1;
    printf("%.2f %.2f %.2f\n", a->x, a->y, a->z);

}

void foo(){
    int i = 0;
    //(7)++;
}