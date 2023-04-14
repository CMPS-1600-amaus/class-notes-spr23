#ifndef SHAPE_H
#define SHAPE_H
#include "Shape.hpp"
#endif

class Square: public Shape {
    double len;

    public:
    Square(double len);
    void print();
    double area();
};