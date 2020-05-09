(ns euler.problem-5.main
  [:gen-class])

(defn find-smallest-number
  "Find the smallest number evenly divisible by all numbers up to n"
  [n]
  (loop [y 1]
    ; Loop all numbers up to n and  get the remainder
    (let [res
      (reduce
        (fn [i x] (+ i (mod y x)))
        (range 0 (inc n))
        )]

      ; If the sum is zero, the smallest number was found
      ; so return it. Otherwise, increment y and restart.
      (if (= res 0)
        y
        (recur (inc y))
        )
      )
    )
  )
