# Exception Handling

``` java
try {
    // risky code
} catch(Exception e) {
    // what to do if the risky code fails
}
```

Java has an Exception Hierarchy with different exceptions cooresponding to different failures.

We can have multiple catch blocks, each for different types of exceptions. This allows to fine-tune the response based on what went wrong.

``` java
try {
    // risky code
} catch(IOException e) {
    // what to do for IOExceptions
} catch(Exception e) {
    // what to do for everything else
}
```

## Checked vs. Unchecked Exceptions

The compiler forces us to handle some exceptions and not others.

There are some exceptions that the compiler checks to see that you handle.

Add RuntimeExceptions are unchecked: ArithmeticException, ArrayIndexOutOfBounds, and other exceptions that can be avoided logically.

All other exceptions are checked exceptions.

We can handle exceptions in two ways:

1) Put the offending code in a try-catch block
2) Throw the exception to the caller

How do we decide where to put the try-catch block? Where ever in the program you have the right context to do something meaningful about the exception. For example, at the right level of function calls where you can ask the user for a different file name.

## Finally Block

The finally block allows us a place to put instructions that must execute no matter what happens in the try-catch.

Perfect for things like closing files.

## Try-with-resource

``` java
try (
  BufferedReader input = new BufferedReader(new File("myFile.txt"));
) {
  // rest of code that depends on the resources.
} catch (IOException e) {
  // handle the exception
}
```

This is the best way of handling any IO object. All objects in the resources sections will automatically be closed by java.