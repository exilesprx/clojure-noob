(ns clojure-noob.mapset
  (:gen-class))

(defn mapset
  "Excutes the given function on each vector value and returns a set."
  [func vec]
  (set
    (for [x vec]
      (let [res (func x)]
        res)
      )
    )
  )
