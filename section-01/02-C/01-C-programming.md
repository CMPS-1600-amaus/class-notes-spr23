# C Programming

# History

The C Programming language is tied up with the originas of computing as we interact with it today.

C was integral in the development of the grandparent of most operating systems: UNIX.

UNIX was developed at Bell Labs (of AT&T) in the late 1960's.

At this time, computers were mainframes. They had custom operating systems and were operated by batch processing. Programs were fed in by hand one at a time using punchcards.

Colossaly inefficient. Most time was spent waiting for the next program.

To address this, Time Sharing operating systems were invented. All multiple programs to run on a computer at the same time by giving the OS the ability to control and share the CPU amongst them.

As a result, the goal was to allow multiple users to use a computer at the same time.

Mutics was the first OS to attempt this. It was spear-headed by MIT, GE, and AT&T.

The motivation was to create computing utilities, to sell access to mainframes via terminals.

Multics was over-engineered and was a failure.

When Bell Labs pulled out of the project in 1969, the CS department lost access to their mainframe.

Jen Thompson, Dennis Ritche, Doug MCllroy, and Joe Ossanna wanted to keep working on the idea of multics.

They finagled out of AT&T a computer from the accounting department (PDP-7) to continue their work.

One of the reasons multics failed was that there wasn't a good language to write it in.

Before they could write their operating system, they first had to write a programming language to write their OS in.

As a first pass, Thompson wrote the lanauge BCPL ("B").

B still lacked features that would make development feasible.

**First Hello World Program**
``` B
main( ) {
    extern a, b, c;
    putchar(a); putchar(b); putchar(c); putchar('!*n');
}

a 'hell';
b 'o, w';
c 'orld';
```
Presented by Brian Kernighan in *A Tutorial Introduction to the Language B*

Major Con's of B:
- It has no data types, no int, char, long, etc...
- Designed explicitly for the hardware of previous machines, all variables were 36-bit words
- compiler produced inefficient code.

To address these issues, Dennis Ritchie wrote the C programming language.

The goal was to produce powerful abstractions for writing programs, but to stay close to the hardware.

Provide functions, but also direct memory access.

Another goal was to create a language that was as simple and small as possible. 

Once C was written, then it was used to writwe UNIX, then most Operating Systems that followed, and games, and other programming languages as well (for example, python and java.)

# So what is C?

C is a system's language, designed with OS development in mind.

## Familiar Features

- Variables and Variable Types
- Arrays
- Control Structures
    - If-else
    - switch
    - while, do-while
    - for
    - break, continue
- functions
    - recursive functions

## Familiar Features
- structs and unions
- pointers

## Not in C
- No objects or classes
- No access modifiers
- booleans
- strings

C was intentionally kept very small, so some functionality like strings and booleans we have to import to use. They are not a part of the bare bones language.

## A first example

Let's write a twin prime number generator.

