#include "Shape.hpp"

Shape::Shape(string name) {
    this->name = name;
}

void Shape::print() {
    cout << "Shape " << this->name << endl;
}