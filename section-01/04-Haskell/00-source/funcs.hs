lucky :: (Integral a) => (Fractional s) => a -> s  
lucky 7 = 7.0
lucky x = 0.0

mult :: (Num a) => a -> a -> a 
mult x y = x*y

factorial :: (Integral n) => n -> n
factorial 0 = 1
factorial n = n * factorial(n-1)

list_sum :: (Num a) => [a] -> a
list_sum [] = 0
list_sum (x:[]) = x
list_sum xs = head xs + list_sum (tail xs)