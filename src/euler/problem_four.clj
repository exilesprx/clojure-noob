(ns euler.problem-four
  (:gen-class))

(defn is-palindrome?
  [num]
  (= (str num) (clojure.string/reverse (str num)))
  )

(defn find-largest-palindrome
  "Finds the largest palindrome start at num."
  [num]
  (let [palindromes (for [x (range 999 100 -1)
        y (range 999 100 -1)
        :let [res (* x y)]
        :when (is-palindrome? res)]
    res)]
    (apply max palindromes))
  )
