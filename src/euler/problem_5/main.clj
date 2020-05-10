(ns euler.problem-5.main
  [:gen-class])

(defn gcd
  "Find the greatest common denominator using Euclidean algorithm."
  [a b]
  (if (zero? b)
    a
    (recur b (mod a b)))
  )

(defn find-smallest-number
  "Find the smallest number evenly divisible by all numbers up to n"
  [n]
  (loop [y 1
        ans 1]
    (if (<= y n)
      (recur (inc y) (/ (* ans y) (gcd ans y)))
      ans
      )
    )
  )
