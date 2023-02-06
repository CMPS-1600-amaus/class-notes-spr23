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

An abstract class is a class with one or more abstract methods.

An abstract method is a method declaration without any implementation.

Why use abstract methods?

Abstract methods are useful in an inheritance hierarchy when we know that subclasses need some functionality but it doesn't make sense to implement it at the superclass level.

For example: `defend()` and `takeTurn()` in HackerGame.

Suppose we have a class `Shape` with subclasses `Circle` and `Square`.

We should be able to able calculate the `area()` for all shapes.

We can't implement `area()` in the Shape class because we need to know what Shape we are in order to calculate it. So we make it abstract and force all subclasses to provide their specific implementation.

# Interfaces

An interface is a class with only abstract methods. 

Classes which implement an interface must override its abstract methods.

Interfaces are used whenever we want to have disparate classes share common functionality. When we want to know that we can use the same functions on each of these classes with the behavior being specific to each of them.

For example:

Java has an interface `Comparable`.

Comparable defines a method `compareTo()` which can be used to compare objects. 

If you want to be able to sort your objects, you want to implement this interface so that individual objects can be compared and ranked.


If you want to have a class inherit from an interface, use the `implements` keyword.

for example:

``` java
public class QuarterBack implements Comparable, JFrame{
    ...
}
```

In java, a class can only extend a single other class, but it can implement multiple interfaces.

# Polymorphism

**Polymorphism** says that if we have a superclass variable which stores a subclass object, when overridden methods are called, the correct version, depending on the actual subclass, will be used.

For example:

``` java
Character character1 = new Player(....);
Character character2 = new Computer(...);

character1.takeTurn();
character2.takeTurn();
```