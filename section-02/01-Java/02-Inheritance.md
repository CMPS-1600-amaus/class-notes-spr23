# Inheritance

Inheritance allows us to build new classes by using others as a foundation.

When we have one class inherit from another, the subclass gets access to all non-private features of the superclass as if they belonged to it, because they do.

Subclasses can use all of their superclasses features and add their own specific features on top.

Inheritance is extremely useful when classes share common features. Those features can be pulled into a superclass which the subclasses can simply inherit from.

## Syntax

We use `extends` to set up inheritance:

``` java
public class SubClass extends SuperClass{
    ...
}
```

## Constructors

Before the subclass can be instantiates, its superclass must also be instantiated.

The superclass object must exist for a subclass object to inherit from it.

We can explicitly call on the superclass constructor using the `super` keyword.

Example:

```java 
public class SubClass extends SuperClass{
    public SubClass(){
        super(); // call on super class constructor
    }
}
```

The first thing that every constructor does is call on its super classes constructor.

All classes ultimately inherit from the Object class.

If we write a class that doesn't extend anything, by default, it extends Object. When that class's constructor is call, the first thing that happens is Object's constructor is called, even if we don't explicitly do it.

## Overriding Methods

A subclass can **override** its superclass's methods. That is, it can provide its own specific implementation.

## Overloading Methods

If we create a copy a method that we already have but give it different parameters, we are **overloading** that method.

## Abstract Classes