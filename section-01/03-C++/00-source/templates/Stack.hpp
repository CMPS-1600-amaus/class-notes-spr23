#include <vector>
using namespace std;
template <class E> class Stack {
private:
  vector<E> stack;

public:
  // Stack(); // rely on default constructor
  void push(E element);
  E pop();
  bool isEmpty();
};
