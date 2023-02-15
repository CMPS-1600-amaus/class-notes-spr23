# Software Development


```
   Contibuted to the benefit of society
 ^ Maintainable
 | Readable
 | Well-Tested
 | Compiles
```

We strive to write programs that are well-tested, readable, and maintainable. By maintainability, we should be able to easily debug our programs, but also easily add to and adapt the features of our program.

We achieve readable and maintainable code by clear and simple code, but also by documenting that code.

## Documentation

We both comment (especially doc comments) our programs and provide diagrams (UML) where necessary for them.

## Unit Testing

Unit Testing is a methodology of building out test functions so that you can **automatically** test your programs.

With a set of unit tests, you can verify that your entire program (because you've written tests for the whole thing) works after every modification of it. This frees you to make big changes as necessary.

### Writing Unit Tests

We write a test class for every class in our project. The test class consists of test methods for the methods of that class.

The goal when writing unit tests is to try to break your functions. Prove to yourself that they work by failing to break them.

Test multiple possible inputs, especially around boundary cases. If the possible range of inputs is 0-100, does it work for 0? For 100? For some numbers in between?

### Test-Driven-Development

It is possible, and there are important benefits to writing your tests before actually implementing your functions.

Once you've decided which functions to write and what they should do, a great development cycle is to stub them out, implement tests for them, then implement the functions until all tests pass.

The tests act like a positive reinforcement checklist. Every test passed is visible progress.

More importantly, this results in more robust tests and code for a couple of reasons. By thinking through the tests first, special cases, corner cases, and tricky parts are front of mind and you will be prepared to handle them in your implementations.

If tests are an afterthought, lest robust tests tend to be written, and they tend to be geared to the implementation of the functions, rather than the implementation of the functions being geared to the tests written.


