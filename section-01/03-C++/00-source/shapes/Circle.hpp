#include "Shape.hpp"
class Circle: public Shape {
    double radius;

    public:
    Circle(double radius);
    void print();
};