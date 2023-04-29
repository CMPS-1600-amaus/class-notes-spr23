# Functional Languages

In functional languages, rather than writing programs as series of
steps to be completed, we write them as a set of simple functions that
call on each other to solve the problem.

Instead of telling the computer what to do step by step, we focus on
building up definitions.

We solve problems by transforming the input until we get to the final
output.

We can think of a haskell program as a series of transformations from
input to output.

Example:

``` haskell
[x | x <- [1..100], odd x, rem x 3 == 0, rem x 5 == 0]
```

We built up this by starting with an original list and add transformations until
we got to our final result.

## Currying

In haskell, functions only take in a single parameter and return a single output.

We're essentially given the illusion that we have multiparameter functions.

This illusion is provided through the mechanism of **currying**, named after
Haskell Curry.

``` haskell
mult :: (Num a) => a -> a -> a 
mult x y = x*y
```

`mult` is a actually a function composition. The inner function takes in
a value and returns it. The outer function multiplies a parameter by the
result of the inner fuction.

E.g,

`mult 4 5`:

`mult1 = mult 4`

`mult1` is now a function that takes in a parameter and multies it by 4.

`mult 4` refers to the function that returns 4.

`mult1 5` returns 20 (4*5)

## Lambda Function

A lambda function is an anonymous function.

Syntax:

`\x -> x*x` defines an an anonymous function that squares x.

`(\x -> x*x) 5` applies it to 5

Using lambda functions to define mult:

`(\a b -> (\a -> a)(a)*b) 5 7`

Mult is an inner fuction which returns a value and multiplies that by
a second parameter:

`(\a -> a)(a)*b`