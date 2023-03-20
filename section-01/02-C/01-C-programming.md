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

## Arrays

An array is a collection of data, all of the same type, stored contiguously in memory.

In C, we can declare an array:

```c
// create an array that holds 50 ints
int nums[50];

nums[0] = 5
printf("nums[0]: %d\n", nums[0]);
```

C arrays do not grow. Their size is set when they are created.

C does not guard against index out of bounds errors.

A c array is just a pointer in memory to be beginning of the array.

When we index past the end of it, we are just moving forward in memory from that spot.

Be careful when using arrays in C.

## Pointers

In C, we have direct access to memory, including knowing the locations where all variables are stores.

Pointers give us the ability to directly access into and refer to memory locations.

A pointer is a variable that holds a **memory address**.

There are two operators that allow us to either refer to the address of a variable or access the value at that address.

`&` gets the address from a variable.

```c
int num = 10;
printf("%p\n", &num);
```

`*` (known as the "dereferencing" operator) allows us to declare a pointer or to get the value that a pointer points to.

```c
int num = 10;
int* p = &num;
printf("%p\n", p);
printf("%d\n", *p);
```

## Pointers and Arrays

Arrays and pointers are intimately tied together. An array is a contiguous segment of memory. An array variable is actually just a pointer to the beginning of that memory.

```c
char arr[10];
printf("%p\n",arr);  
```

### Pointer Arithmetic

If we increment a pointer, we then it points to the next memory address.

```c
char arr[10];
printf("%p\n",arr); 
arr[0] = 5;
arr[1] = 4; 
// print out memory address of beginning of array
printf("%p\n",arr); 
// print out arr[0]
printf("%d\n",*(arr));
// print out arr[1]
printf("%d\n",*(arr+1));
```

C in smart enough to know to move forward to the next int, that is, move forward by 4 bytes.

If the array held longs, incrementing the pointer would move foward to the next long.

## Multidimensional Arrays

We can create multidimensional arrays.

```c
int arr[4][5]; // like a table with 4 rows and 5 columns
```

Every row has the same number of columns. 