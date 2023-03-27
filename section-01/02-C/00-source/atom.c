#include <stdio.h>
#include <stdlib.h>

typedef struct point3D {
    double x;
    double y;
    double z;
} point3D;

typedef struct atom {
    char* name;
    point3D coords;
} atom;

int main(){
    point3D origin = {0, 0, 0};
    printf("%0.2f %0.2f %0.2f\n", origin.x, origin.y, origin.z);

    atom* atomPtr = (atom*)malloc(sizeof(atom));
    atomPtr->name = "he";
    atomPtr->coords = origin;

    printf("%s: %.2f %.2f %.2f\n", atomPtr->name, 
                                   atomPtr->coords.x, 
                                   atomPtr->coords.y, 
                                   atomPtr->coords.z);
}