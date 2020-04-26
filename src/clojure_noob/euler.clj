(ns clojure-noob.euler
  (:gen-class))

(defn problem-one
  [lim]
  (loop [x 1
    sum 0]
    (if (< x lim)
      (recur
        (inc x)
        (if (or (= (mod x 3) 0) (= (mod x 5) 0))
          (+ x sum)
          sum)
        )
      sum)
    )
  )
