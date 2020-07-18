(ns euler.problem-7.test
  (:require [clojure.test :refer :all]
            [euler.problem-7.main :refer :all]))

(deftest test-problem-seven

  (testing "13 is the 6th prime number"
    (is (= (find-nth-prime 6) 13)))

  (testing "73 is the 21th prime number"

    (is (= (find-nth-prime 21) 73))))
