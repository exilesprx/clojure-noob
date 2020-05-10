(ns euler.problem-6.main
  [:gen-class])

(defn sum-square-of
  "Finds the sum of the squares of the first n natural numbers."
  [n]
  (reduce
    +
    (for [x (range (inc n))]
      (int (Math/pow x 2))
      )
    )
  )

(defn square-sum-of
  "Finds the square of the sum of the first n natural numbers."
  [n]
  (int (Math/pow (reduce + (range 1 (inc n))) 2)
    )
  )

(defn find-sum-square-difference
  "Finds the difference between the sum of the squares of the first n natural numbers and the square of the sum."
  [n]
  (- (square-sum-of n) (sum-square-of n))
  )
