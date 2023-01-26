
# Interpretted vs. Compiled languages

Coming from a python background, you all are familiar with interpretted languages. Python is an example of an interpretted language.

That means that when you run a python program, each instruction is interpretted and executed at runtime.

Compiled languages are different. For a compiled language, before executing programm, it must be compiled. Compilation takes the source code and translates it into machine code, instructions that a CPU can execute, producing an executable file. 

Compiled code is specific to the computer architecture that it was compiled for. For example, a program compiled for a modern mac will only run on other modern macs.

Java is actually a mix between a compiled and interpretted language. When a java pogram is compiled, its source is converted in a portable "bytecode". This bytecode can be shared to any computer. To execute that compiled program, a java runtime environement then interprets and executes the bytecode instructions.

In VS Code, this is hidden from us since we can just click "run".

If we run java programs on the terminal, we can see both steps.

For example:

`$ javac HelloWorld.java`

This first instructions compiles `HelloWorld.java`.

`$ java HelloWorld`

This second one runs the `HelloWorld` program. Notice the ".java" extension is omitted.

# Primitive vs Reference Types

## Primitives

Primitive types are the most basic types in java. These are types that are built into the language and not defined by some class:

Examples:

- int
- long
- float
- double
- char

variables that are primitive types hold a single value.

## Reference Types

Reference types are any type that is defined by a class.

Variables that are reference types will refer to objects.

## Wrapper Classes

Wrapper classes exist for all primitives in Java. An object is of the type of one of these wrapper classes will store a primitive of the appropriate type and give us methods to interact or process it in various ways.

Example: [class Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)