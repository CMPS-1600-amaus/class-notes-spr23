# Data Structures

A **data structure** is an object which stores data and provides operations for accessing and modifying that data.

We have different data structures which achieve different efficiencies on these operations.

Our goal in learning about data structures is the ability to be able to choose the right one for the right job based off of efficiencies and/or behaviors.

## Stack

Stacks are defined by their behavior. We "push" elements on top of the stack and we always remove ("pop") the top element from the stack.

Stacks have operations:

- push: add an element to the stack
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

When we pop an element off of it, we will get 3 back.

```
-----
| 2 |
-----
| 1 |
-----
```

## Implementation

If we use an array, we want to insert and remove from the end of the list. If the array isn't full, this is $O(1)$. If the array is full, a new larger array must be created and everything copied over before the new element can be added.

If we use a Linked List, we can insert and remove from either end in $O(1)$. 

We can use a Linked List to implement a stack efficiently.

See Stack.java.

# Queue

Queues are trivially simple, just like stacks. They operate like lines at the grocery store, and we can implement one using a LinkedList just like we did for a stack.

## Operations

- add/enqueue/push : adds an element to the queue
- poll/dequeue : returns and removes an element from the queue
- peek : return the next element from the queue

# Heaps

A Heap is a binary tree that has a different ordering property than a BST.

In a Heap, for every node, all of its children are smaller than it.

Heaps are useful as priority queues and we can use their behavior in algorithms to process smaller entities first. 

## Implementation