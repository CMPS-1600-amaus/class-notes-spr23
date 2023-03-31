#include "Atom.h"

Atom::Atom(string name, double x, double y, double z) {
    this->name = name;
    coords.x = x;
    coords.y = y;
    coords.z = z;
}

void Atom::print() {
    cout << "Element: " << this->name << endl;
}

int main() {
    Atom* c = new Atom("C", 0, 0, 0);
    c->print();
}