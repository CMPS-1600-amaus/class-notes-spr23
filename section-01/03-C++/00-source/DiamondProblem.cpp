#include <iostream>
using namespace std;

class Animal {
    string name;

    public:
    Animal(string name) {
        cout << "Animal constructed: " << name << endl;
        this->name = name;
    }
};

class Fish: public Animal {
    public:
    Fish(): Animal("Fish") {
        cout << "Fish constructed" << endl;
    }
};

class Mammal: public Animal {
    public:
    Mammal(): Animal("Mammal") {
        cout << "Mammal constructed" << endl;
    }
};

class Whale: public Fish, public Mammal {
    public:
    Whale(): Fish(), Mammal() {
        cout << "Whale constructed" << endl;
    }
};

int main() {
    Whale whale;
}