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

list_sum_dc :: (Num a) => [a] -> a
list_sum_dc [] = 0
list_sum_dc (x:[]) = x
list_sum_dc xs = (list_sum_dc left) + (list_sum_dc right)
    where mid = (length xs) `div` 2
          left = take mid xs
          right = drop mid xs

binary_search :: [Int] -> Int -> Bool
binary_search [] k = False
binary_search (x:[]) k = (if x == k then True else False)
binary_search xs k = (if e == k 
                        then True 
                     else if k < e 
                        then (binary_search left k) 
                     else 
                        binary_search right k)
    where mid = (length xs) `div` 2
          left = take mid xs
          right = drop mid xs
          e = xs !! mid