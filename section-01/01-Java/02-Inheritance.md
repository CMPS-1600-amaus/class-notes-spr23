# Inheritance

Inheritance allows us to build new classes by using others as a foundation.

When we set one class to inherit from another, the subclass gets access to all non-private features as if they belonged to it because they do.

This is very useful when classes share common features. We can pull the common features into a superclass and have the subclasses inherit them instead of implement them separately.

## Syntax

We use the `extends` keyword in order to set up inheritance:

``` java
public class Hero extends Character {
    ...
}
```

## Constructors

Before a subclass can be instantiated, its superclass must be instantiated.

That means that constructors within subclasses need to call on the constructor of their superclasses.

They do this using the `super` keyword.

Example:


``` java
public class Subclass extends SuperClass {
    public Subclass(){
        super(); // call on the superclasses no-arg constructor
    }
}
```

## Abstract Classes

An abstract class is a class with one or more abstract methods.

An abstract method is a method declaration without any implementation.

Why use abstract methods?

Abstract methods are useful in an inheritance hierarchy when we know that subclasses need some functionality but it doesn't make sense to implement it at the superclass level.

For example: `takeTurn()` in GriffinSlayer.

Suppose we have a class `Shape` with subclasses `Circle` and `Square`.

We should be able to able calculate the `area()` for all shapes.

We can't implement `area()` in the Shape class because we need to know what Shape we are in order to calculate it. So we make it abstract and force all subclasses to provide their specific implementation.

# Interface

An **interface** is a completely abstract class. It is a class with no concrete methods.

An interface is similar to an abstract in that it defines functionality that subclasses will have even though it can't be implemented outside of the individual subclasses.

In java, there is the `Comparable` interface.

Classes that implement the `Comparable` must define a `compareTo` method which allows for their objects to be compared.

Interfaces are used when we have some general behavior that we need to be done uniformly across the board.

To make a class a subclass of an interface, we use the keys `implements`.

e.g:

```java
public class QuarterBack implements Comparable {
    //...
}
```

# Polymorphism

Polymorphism says that if we have a superclass variable and call on methods that are override by subclasses, the behavior of the method call will be determined by the subclass. The subclass's overridden method will be executed.

For example:

```java
Character player = new Hero("Henry IV", 100, 2, 100);
Character monster = new Monster("Arzaan the Greedy", 1000, 50, 10);

player.takeTurn() // will execute the Hero class's takeTurn
monster.takeTurn() // will execute the Monster class's takeTurn
```