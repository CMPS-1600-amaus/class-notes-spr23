# Exception Handling

``` java
try {
    // risky code
} catch(Exception e) {
    // what to do if the risky code fails
}
```

For certain tasks java requires exception handling, things like file IO.

For others, like divide / 0, exception handling is optional.

Java has a whole hierarchy of Exceptions

At the root of this hiearchy is class Exception.

We have different exceptions so that we can specify our response based on the type of exception thrown.

For example:

``` java
try {
    // risky code
} catch(IOException e) {
    // Handle IO Exception
} catch(Exception e) {
    // Handle all other exceptions
}
```

Any IO exceptions will be handled by the first catch block. ALl others, by the second.

## Checked vs. Unchecked Exceptions

Exceptions that we are required to handle are known as "checked" exceptions because Java checks that you handle them at compilation. All other exceptions are unchecked.

All RuntimeExceptions are unchecked. These include ArithmeticException and other exceptions you can logically avoid.

Everything else is checked.

We can handle exception in two ways:

1) put the offending code in a try catch block
2) throw the exception to the caller

How do we decide where to put a try-catch block? Where ever in the program we have the right context to respond appropriately

## Finally block

The finally block is used to contain all instructions that must execute now matter how the try-catch block executes.

## Try-with-resources

Try-with resources is the best way of handling any file io objects. You instantiate them in the resources section, and they will automatically be closed.

``` java
try (
  BufferedReader input = new BufferedReader(new File("myFile.txt"));
) {
  // rest of code that depends on the resources.
} catch (IOException e) {
  // handle the exception
}
```