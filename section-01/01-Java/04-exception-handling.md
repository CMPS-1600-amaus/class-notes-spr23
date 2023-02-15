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