(ns clojure-noob.euler-test
  (:require [clojure.test :refer :all]
            [clojure-noob.core :refer :all]
            [clojure-noob.euler :refer :all]))

(deftest euler
  (testing "The sum of all multiple of 3 and 5 below 10 should equal 23"
    (is
      (= 23 (problem-one 10))
      )
    )

  (testing "The sum of all even fibonacci numbers below 10 should equal 10"
    (is
      (= 10 (problem-two 10))
      )
    )

  (testing "The largest prime factor of 13,195 is 29.")
    (is
      (= 29 (problem-three 13195))
      )
  )
