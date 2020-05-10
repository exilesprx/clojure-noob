(ns euler.problem-4.main
  (:gen-class))

(defn is-palindrome?
  [num]
  (= (str num) (clojure.string/reverse (str num)))
  )

(defn find-largest-palindrome
  "Finds the largest palindrome from a product of two n-digit numbers."
  [n]
  (let [palindromes (for [x (range (int (dec (Math/pow 10 n))) (int (Math/pow 10 (dec n))) -1)
        y (range (int (dec (Math/pow 10 n))) (int (Math/pow 10 (dec n))) -1)
        :let [res (* x y)]
        :when (is-palindrome? res)]
    res)]
    (apply max palindromes))
  )
