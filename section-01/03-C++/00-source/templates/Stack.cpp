#include "Stack.hpp"
#include <iostream>
#include <string>
using namespace std;

template <class E> void Stack<E>::push(E element)
{
  stack.push_back(element);
}

template <class E> E Stack<E>::pop()
{
  E element = stack.back();
  stack.pop_back();
  return element;
}

template <class E> bool Stack<E>::isEmpty()
{
  return stack.empty();
}

int main()
{
  Stack<char> theStack;
  string str = "flip it and reverse it";
  for(char c : str){
    theStack.push(c);
  }

  while(!theStack.isEmpty()){
    cout << theStack.pop();
  }
  cout << endl;
  return 0;
}
