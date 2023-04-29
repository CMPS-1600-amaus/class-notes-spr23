# Functional Languages

Instead of writing our programs as series of steps to be
performed, we define the solutions to our programs as a set
of function calls.

We focus on building up definitions.

We solve our problems transforming the input until we get to 
the final output.

When writing functional programs, we define what we want rather
than implement how to get it.

Example:

``` haskell
[x | x <- [1..100], odd x, rem x 3 == 0, rem x 5 == 0]
```

We built this up by starting with an original list and adding 
transformations until we got to our final result.

## Currying

In Haskell, functions only take in a single argument and
return a single result. 

We're essentially given the illusion that we have 
multiparameter functions.

This illusion is provided through the mechanism of
**currying**, named after Haskell Curry.

```haskell
mult :: (Num a) => a -> a -> a
mult x y = x*y
```

`mult` is actually a function composition. The inner function takes
in a value and returns it. The outer function multiplies a parameter
by the result of the inner function.

`mult a b = (\x -> x)(a)*b`

`mult 4 5`

`mult4 = mult 4`

`mult4` is now a function that takes in a parameter and multiplies it
by 4.

## Lambda Functions

A lambda function is an anonymous function.

Syntax:

`(\x -> x*x)` defines an anonymous function that returns the square of x.

`(\x -> x*x) 5` defines that function and applies it to 5.

