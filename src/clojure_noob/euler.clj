(ns clojure-noob.euler
  (:gen-class))

(defn problem-one
  "Finds the sum of all the multiples of 3 or 5 within (range 1 lim 1)."
  [lim]
  (loop [x 1
    sum 0]
    ; If the limit is not reached, then loop.
    ; Otherwise, return the sum.
    (if (< x lim)
      (recur
        (inc x)
        ; If the counter is a multiple of 3 or 5, add it to the sum.
        ; Otherwise, return the current sum.
        (if (or (= (mod x 3) 0) (= (mod x 5) 0))
          (+ x sum)
          sum)
        )
      sum)
    )
  )

(defn problem-two
  "Finds the sum of all even fibonacci numbers below the limit starting with 1 and 2."
  [lim]
  (reduce +
    (filter even?
      (loop [res [1 2]]
        (if (< (last res) lim)
          (recur
            (conj
              res
              ; Get the two previous numbers and
              ; add their sum to the set.
              (+ (last res) (last (butlast res)))
              )
            )
          res)
        )
      )
    )
  )

  (defn problem-three
    "Finds the largest prime factor of the number given."
    [number]
    1
    )
