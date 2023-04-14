#include "Circle.hpp"

Circle::Circle(double radius): Shape("Circle") {
    this->radius = radius;
}

void Circle::print() {
    Shape::print();
    printf("Radius: %.2f\n", this->radius);
    printf("Area: %.2f\n", this->area());
}

double Circle::area() {
    return 3.14159265 * this->radius * this->radius;
}