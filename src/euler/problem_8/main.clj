(ns euler.problem-8.main
 (:gen-class))

(defn digits
  "Converts a series of numbers into a set."
  [n]
  (->> n str (map (comp read-string str))))

(defn get-num-digits
  "Returns 13 digits starting at n."
  [num digits n]
  (take num (drop n digits)))

(defn largest-product-in-series
  "Finds the largest product of X adjacent digits numbers in a series."
  [x n]
  (let [dig (digits n)]
    (loop [y 0
           col (get-num-digits x dig y)
           res 0]
      (if (= (count col) x)
        (if (> (reduce * col) res)
          (recur (inc y) (get-num-digits x dig (inc y)) (reduce * col))
          (recur (inc y) (get-num-digits x dig (inc y)) res))
        res))))
