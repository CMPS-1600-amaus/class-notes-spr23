#include <iostream>

using namespace std;

class Vehicle {
    string name;

    public:
    Vehicle(string name) {
        cout << "Vehicle constructed: " << name << endl;
        this->name = name;
    }

    string getName() {
        return this->name;
    }
};

// Virtual inheritance means that in the case of multiple inheritance,
// only a single instance of the superclass will be built
class Car: virtual public Vehicle {
    public:
    Car(): Vehicle("Car") {
        cout << "Car constructed" << endl;
    }
    
};

class Plane: virtual public Vehicle {
    public:
    Plane(): Vehicle("Plane") {
        cout << "Plane constructed" << endl;
    }
};

class FlyingCar: public Plane, public Car {
    public:
    FlyingCar(): Plane(), Car(), Vehicle("Flying Car") {
        cout << "Flying Car constructed." << endl;
    }
};

int main() {
    FlyingCar fc;

}