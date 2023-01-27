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