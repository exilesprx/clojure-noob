(ns clojure-noob.mapset
  (:gen-class))

(defn mapset
  "Excutes the given function on each vector value and returns a set."
  [func vec]
  (set
    ; Excute a function on the value on each value in the vector
    (for [x vec]
      (func x))
    )
  )
