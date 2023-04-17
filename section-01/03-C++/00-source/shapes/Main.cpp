#include "Circle.hpp"
#include "Square.hpp"
#include <vector>

using namespace std;

int main() {
    Circle circle(1);
    //circle.print();

    Square square(1);
    //square.print();

    vector<Shape*> vector;
    vector.push_back(&circle);
    vector.push_back(&square);
    vector.push_back(new Square(4));

    for(Shape* shape: vector){
        shape->print();
    }
}