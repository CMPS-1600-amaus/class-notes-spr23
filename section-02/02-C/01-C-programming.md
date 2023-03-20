# C Programming

# History

The C Programming Language is tied up with the origins of computing as we interact with it today.

C is intimately integrated with the origins of UNIX, the grandparent operating system of most OSs today.

In the 50 and 60s, computers were mainframes with OS's (if you could call them that) implemented in assembly. They used batch processing. Programs were written on punch cards, which were fed in by hand. This is super inefficient. All the time between programs was wasted.

To address this, Time Sharing was invented. The computer would share the cpu between mutiple programs and multiple users. Programs would get little slices of time.

Multics (the predecessor of UNIX) was an ambitious project spearheaded by MIT, GE, and AT&T.

The motivation was to create computing utilities, to sell access to mainframes via remote terminals. 

Multics was failure. Too ambitious, over-engineered.

When Bell Labs pulled out of the project in 1969, the CS department lost access to the mainframe.

The four researchers (Ken Thompson, Dennis Ritchie, Doug MClloy, Joe Ossana) still wanted to work on the idea of timesharing.

Eventually they tricked AT&T into getting them a PDP-11. 

One of the reasons UNIX failed was that there was no good language to write it in.

Before they could write their operating system, they first had to write a programming language to write it in./

First pass, Ken Thompson wrote a language called BCPL ("B"). B was still lacking features that would make OS development feasible.

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
Presented by Brian Kernighan in *A Tutorial Introduction to the Language B*.

Major con's of B:
- It has no data types: no int, char, long, float, etc..
- Designed explicitly for specific hardware, all variables 36 bit words
- compiler produced inefficient assembly code

To address these issues, Dennis Ritchie wrote the C Programming Language. 

The goal was to provide powerful abstractions for writing programs, yet also stay close to the hardware. Particularly, give direct access to memory.

Another goal was to keep the language as simple and small as possible. 

Once C was written, then it was used to write UNIX, and from there most other operating systems, many games, and many of languages. 

## So What is C?

C is a system's language, designed with OS development as its goal.

## Familiar Features

- variables and variable types
- arrays
- control structures
    - if-else
    - switch
    - while, do-while
    - for
    - break, continue
- funtions
    - recusive function

## Unfamiliar Features
- structs
- pointers

# Not in C
- Not Objects or Classes
- Access Modifers
- booleans
- strings

C was intentionally kept very small, so some functionality like strings and booleans has to be included (import) to use.

# A first example

Let's write a twin prime number generator.

# Arrays

An array is a collection of data, all of the same type, stored coniguously in memory.

# Pointers

A pointer is just a memory address. We can create pointers, or even get the memory addresses back from any variable we have.

There are two operators that allow us to either refer to the address of a variable or access the value at that address.

`&` gets the address from a variable.

```c
int num = 10;
printf("%p\n", &num);
```

`*` (known as the "dereferencing" operator) allows us to declare a pointer or to get the value that a pointer points to

```c
// num is a pointer. It holds a memory address
int num = 10;
int* ptr = &num;
printf("%p\n", ptr);
printf("%d\n", *ptr);
```

## Pointers and Arrays

Arrays and pointers are intimately tied together. An array is a contiguous set of bytes of memory.

An array variable is a pointer to the first byte of the array.

```c
int arr[10];
arr[0] = 5;
arr[1] = 4;
// print out the memory address of arr[0]
printf("%p\n", arr);
```

### Pointer Arithmetic

In we increment a pointer, it then points to the next thing in memory.

```c
int arr[10];
arr[0] = 5;
arr[1] = 4;
// print out arr[0]
printf("%d\n", *arr);
// print out arr[1]
printf("%d\n", *(arr+1));
```

C is smart enough to move forward to the next int, moving forward 4 bytes since an int is 32 bits.

If the array held longs, we would expect to see pointer arithmetic move the pointer forward by 8 bytes.

## Multidimensional Arrays

