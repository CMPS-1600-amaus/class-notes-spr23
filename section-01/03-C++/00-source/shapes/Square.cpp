#include "Square.hpp"

Square::Square(double len): Shape("Square") {
    this->len = len;
}

void Square::print() {
    Shape::print();
    printf("len: %.2f\n", this->len);
    printf("Area: %.2f\n", this->area());
}

double Square::area() {
    return this->len * this->len;
}