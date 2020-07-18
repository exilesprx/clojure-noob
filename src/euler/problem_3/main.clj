(ns euler.problem-3.main
  (:gen-class))

(defn is-prime?
  [n]
  (if (= (mod n 2) 0)
    false
    (let [root (Math/floor (int (Math/sqrt n)))]
      (loop [i 3]
        (if (> i root)
          true
          (if (= 0 (mod n i))
            false
            (recur (+ i 2)))))))) ; The step between primes are either 2, 4 or 6

(defn prime-factorization-tree
  "Finds the prime factorization tree of the given number."
  [n]
  (loop [x 2
         y n
         res []]
    ; If the factors equal the number passed, the tree is complete
    (if (= (reduce * res) n)
      res
      (let [prime (is-prime? x) next (/ y x)]
        ; If we found a prime and it to the result, otherwise
        ; restart the process with x+1
        (if (and prime (integer? next))
          (recur 2 next (conj res x))
          (recur (inc x) y res))))))

(defn find-largest-prime-factor
  "Finds the largest prime factor of the given number."
  [n]
  (last (prime-factorization-tree n)))
