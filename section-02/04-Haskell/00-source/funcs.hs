mult :: (Num a) => a -> a -> a
mult x y = x*y

lucky :: (Integral x) => x -> String
lucky 7 = "Lucky!"
lucky n = "Sorry!"

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

binary_search :: (Ord a) => [a] -> a -> Bool
binary_search [] key = False
binary_search (x:[]) key = (if x == key then True else False)
binary_search xs key = (if e == key 
                            then True 
                        else if key < e 
                            then binary_search left key
                        else 
                            binary_search right key)
    where mid = (length xs) `div` 2
          left = take mid xs
          right = drop mid xs
          e = xs !! mid