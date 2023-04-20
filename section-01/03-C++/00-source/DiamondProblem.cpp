#include <iostream>
using namespace std;

class Animal {
    string name;

    public:
    Animal(string name) {
        cout << "Animal constructed: " << name << endl;
        this->name = name;
    }

    virtual void print() {
        cout << "ANIMAL!!!" << endl;
    }
};

// Virtual inheritanc means that in the case of multiple inheritance,
// only a single instance of the superclass will be constructed.
class Fish: virtual public Animal {
    public:
    Fish(): Animal("Fish") {
        cout << "Fish constructed" << endl;
    }

    virtual void print() {
        cout << "FISH!!!" << endl;
    }
};

class Mammal: virtual public Animal {
    public:
    Mammal(): Animal("Mammal") {
        cout << "Mammal constructed" << endl;
    }

    virtual void print() {
        cout << "MAMMAL!!!" << endl;
    }
};

class Whale: public Fish, public Mammal {
    public:
    Whale(): Fish(), Mammal(), Animal("Whale") {
        cout << "Whale constructed" << endl;
    }

    virtual void print() {
        Fish::print();
    }
};

int main() {
    Whale whale;
    whale.print();
}