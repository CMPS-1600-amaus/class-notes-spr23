#include "Atom.hpp"

Atom::Atom(string name, double x, double y, double z) {
    this->name = name;
    coords.x = x;
    coords.y = y;
    coords.z = z;
}

Atom::Atom(const Atom &atom) {
    cout << "Atom copy constructor called." << endl;
    this->name = atom.name;
    this->coords.x = atom.coords.x;
    this->coords.y = atom.coords.y;
    this->coords.z = atom.coords.z;
}

void Atom::print() {
    cout << "Element: " << this->name << endl;
}

void foo(Atom* atom) {
    cout << "FOO!" << endl;
}

int main() {
    Atom* c = new Atom("C", 0, 0, 0);
    c->print();
    delete c;

    Atom o("O", 0, 0, 0);
    foo(&o);
}