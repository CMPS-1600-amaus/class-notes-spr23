# Objects and Classes

An **object** is most generally a set of attributes and methods to interact with them.

An **class** is the definition for its objects. Its where we define the attributes and implement the methods.

Starting point for writing a class:

1) What are the *relevant* attributes?
2) What functions do we *need*?

## Designing the Player Class

Relevant Attributes:

- health
- damage
- name
- description

Methods:

- attack

## Constructors

Constructors are special functison whose it is to inialize all **instance variables**.

**Instance variables** are those attributes which every object gets its own copy of.

## Access Modifiers

Access modifiers control where some class feature (attributes or methods) can be accessed from.

`private` and `public` are two of these modifiers.

`private` indicates that the feature is only accessible within the class in which it is defined.

`public` indiates that the feature is accessible any and everywhere.

There are two other access modifierds, the **default** access modifer and `protected`.
 
We should make all instance variables `private` unless we have a very good reason not too.

## Encapsulation

By encapsulating the attributes within the class and not allowing access to them outside of it: 

1) if any bugs crop up relating to them, we have a limited area in which to investigate.
2) We are hiding implementation details from the users of the class

The second point makes it much easier to change the implementation than if the variable were accessed and modified throughout the whole program.

# `static`

Whether or not a feature is `static` determines whether it belongs to the class as a whole and is shared amongst all objects of the class or whether that feature gets its own copy individually.

Example, a `static` population variable in Sims.

``` java
public class Sim {
    public int population = 0;
    // ...
}

public class SimsGame {
    public static void main(String[] args){
        System.out.println(Sim.population);
    }
}
```

The population variable belongs to the Sim class as a whole.

The main method is `static` so that java can call it to start the program before any objects are created.