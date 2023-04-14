#include <iostream>
using namespace std;

class Shape {
    string name;

    public:
    Shape(string name);
    // virtual means that pring is overridable
    virtual void print();
    virtual double area() = 0;
};