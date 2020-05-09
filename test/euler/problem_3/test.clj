(ns euler.problem-3.test
  (:require [clojure.test :refer :all]
            [euler.problem-3.main :refer :all]))

(deftest test-problem-three

  (testing "Three is prime"
    (is (is-prime? 3)))

  (testing "Thirteen is prime"
    (is (is-prime? 13)))

  (testing "Four hundred ninety-nine is prime"
    (is (is-prime? 499)))

  (testing "Six is not prime"
    (is (not(is-prime? 6))))

  (testing "Finds the prime factorization tree of 13,195"
    (is
      (= [5 7 13 29] (prime-factorization-tree 13195))))

  (testing "The largest prime factor of 13,195 is 29."
    (is
      (= 29 (find-largest-prime-factor 13195))
      )
    )
  )
