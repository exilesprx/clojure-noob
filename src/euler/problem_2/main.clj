(ns euler.problem-2.main
  (:gen-class))

(defn fibonacci-generator
  "Generates fibonacci numbers below the limit"
  [lim]
  (loop [res [1 2]]
    (if (< (last res) lim)
      (recur
       (conj
        res
        ; Get the two previous numbers and
        ; add their sum to the set.
        (+ (last res) (last (butlast res)))))
      res)))

(defn find-sum
  "Finds the sum of all even fibonacci numbers below the limit starting with 1 and 2."
  [lim]
  (reduce + (filter even? (fibonacci-generator lim))))
