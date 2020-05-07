(ns euler.problem-five
  [:gen-class])

  (defn find-smallest-number
    "Find the smallest number evenly divisible by all numbers up to n"
    [n]
    (loop [y 1]
      ; Loop all numbers up to n and  get the remainder
      (let [res (for [x (range 1 n)
                      :let [div (mod y x)]]
                      div)]

        ; If the sum is zero, the smallest number was found
        ; so return it. Otherwise, increment y and restart.
        (if (= (reduce + res) 0)
          y
          (recur (inc y))
          )
        )
      )
    )
