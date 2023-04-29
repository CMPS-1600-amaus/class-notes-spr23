mult :: (Num a) => a -> a -> a
mult x y = x*y

lucky :: (Integral x) => x -> String
lucky 7 = "Lucky!"
lucky n = "Sorry!"

list_sum :: (Num a) => [a] -> a
list_sum [] = 0
list_sum (x:[]) = x
list_sum xs = head xs + list_sum (tail xs)