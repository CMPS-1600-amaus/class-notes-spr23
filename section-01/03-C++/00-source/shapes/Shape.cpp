#include "Shape.hpp"

Shape::Shape(string name){
    this->name = name;
}

void Shape::print() {
    printf("Shape %s\n", this->name.c_str());
}