#ifndef SHAPE_H
#define SHAPE_H
#include "Shape.hpp"
#endif

class Circle: public Shape {
    double radius;

    public:
    Circle(double radius);
    void print();
    double area();
};