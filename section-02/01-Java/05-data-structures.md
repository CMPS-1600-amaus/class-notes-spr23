# Data Structures

Abstractly, there is this idea of **Abstract Data Type**. An ADT defines the structure, operations, and sometimes the runtimes for those operations. 

A **Data Structure** is an object that stores data and provides operations for accessing and modifying that data.

A Data Structure is a realized implementation of an ADT.

Why study data structures?

Different data structures have different runtimes for their fundamental operations. They have different strengths and weaknesses.

By being familiar with several of them, you can choose the right one for the job based on desired behavior and/or runtimes.

We'll discuss Stacks, Queues, Heaps, and Hash Tables.

## Stack

Stacks are defined by their behavior. We "push" elements onto the top of the stack, and we always remove ("pop") the top element off of the stack.

Stack Operations:

- push: add an element to the top of the stack.
- pop: return and remove the top element from the stack
- peek: return the top element from the stack

Behavior:

Starting from an empty stack, if we push 1, then 2, then 3 onto it.

It will look like:

```
-----
| 3 |
-----
| 2 |
-----
| 1 |
-----
```

When we pop an element off it, we will get back 3.

```
-----
| 2 |
-----
| 1 |
-----
```

## Implementation

We can use a Linked List. Inserting and Removing from the beginning or end of a linked list is $O(1)$

# Queue

A queue if First-In First-Out. The first element inserted will be the first element removed.

Operations:

- add/offer/enqueue : add an element to the queue
- remove/poll/dequeue: returns and removes the next element from the queue
- peek: return the next element on the queue

Again, implement using a LinkedList

# Heaps

A Min-Heap is a Binary Trees where the element in every node is smaller than all of its children.

We also can create a max heap.

This means that the smallest element in the Heap is always at the root.

Heaps are used to implement priority queues.

The "poll" operation returns and removes the smallest element, the root element.

## Operations

