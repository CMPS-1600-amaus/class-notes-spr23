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