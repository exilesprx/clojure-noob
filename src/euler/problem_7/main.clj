(ns euler.problem-7.main
  (:gen-class)
  (:require [euler.problem-3.main :refer :all]))

(defn find-nth-prime
  "Finds the nth prime number"
  [n]
  (loop [i 3
         count 1] ; Count starts at one because 2 is prime but we start at 3
    (if (is-prime? i)
      (if (= count (dec n)) ; We already determined the number is prime so "nth prime" = (count - 1)
        i
        (recur (inc i) (inc count)))
      (recur (inc i) count))))
