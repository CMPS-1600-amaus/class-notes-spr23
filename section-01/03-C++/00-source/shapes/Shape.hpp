#include <iostream>
using namespace std;
class Shape {
    string name;

    public:
    Shape(string name);
    // virtual indicates that this function can be overridden
    virtual void print();
    virtual double area() = 0;
};