#include "Circle.hpp"
#include "Square.hpp"
#include <vector>

using namespace std;

int main(){
    Circle circle(1);
    //circle.print();

    Square square(1);
    //square.print();

    vector<Shape*> vec;
    vec.push_back(&circle);
    vec.push_back(&square);
    vec.push_back(new Square(4));

    for(Shape* shape: vec){
        shape->print();
    }
}