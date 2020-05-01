(ns euler.problem-one
  (:gen-class))

(defn find-sum
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
