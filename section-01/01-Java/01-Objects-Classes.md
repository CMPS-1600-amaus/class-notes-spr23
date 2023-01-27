# Objects and Classes

An **object** is most generally a set of data and methods to interact with it.

A **class** is the definition for its objects. Its where we define the variables and implement the functions.

Starting point for writing a class:

1) What is the *relevant* data?
2) What functions do we *need*?

## Designing A Hero Class

Relevant Attributes:

- health
- attackPower
- name

Methods:

- attack()

## Constructors

Constructors are special functions whose job it is to initialize all **instance variables**.

**Instance variables** are those attributes which every object gets its own copy of.

If we don't implement any constuctors, java provides a default constructor. This is a constructor which takes no parameters and does nothing except call on a super classes constructor. (see inheritance notes)

## The `this` keyword

`this` is the self-referential identifier. We use to directly refer to instance variables or instance methods. 

# Access Modifers

`public` and `private` are two of java's access modifiers.

Access modifiers go before every attribute or method declaration.

They set permissions on where the attribute or method is accessible from.

`private` means that the feature is only accessible within the class in which it is derived.

`public` means that it is accessible everywhere.

By default, we should make all instance variable private unless we have very good reason not to.

There are two other access modifiers, the **default** access modifier and `protected`. We'll talk about them later.

# static

Whether or not a class feature is `static` determines whether it belongs to each instance of the class individually or to the class as a whole.

If an attribute is `static`, then there is only one copy of the variable and it is shared by all instances of the class.

Example:

a static variable `population` in a Sim class. Every sim would share this same variable. At any point, we can ask the Sim class what the current population is.

``` java
public class Sim{
    public static pop = 0;
    //...
}

public class Sims{
    public static void main(String[] args){
        System.out.println(Sim.pop)
    }
}
```

The `main` method is static since it is the starting point of the program and must be called before any objects are created.
