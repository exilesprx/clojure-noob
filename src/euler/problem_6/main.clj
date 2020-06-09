(ns euler.problem-6.main
  [:gen-class])

(defn sum-square-of
  "Finds the sum of the squares of the first n natural numbers."
  [n]
  (/ (* (* n (+ n 1)) (+ (* n 2) 1)) 6))

(defn square-sum-of
  "Finds the square of the sum of the first n natural numbers."
  [n]
  (int (Math/pow (/ (* n (+ n 1)) 2) 2)))

(defn find-sum-square-difference
  "Finds the difference between the sum of the squares of the first n natural numbers and the square of the sum."
  [n]
  (- (square-sum-of n) (sum-square-of n)))
