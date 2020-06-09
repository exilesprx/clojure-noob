(ns euler.problem-2.test
  (:require [clojure.test :refer :all]
            [euler.problem-2.main :refer :all]))

(deftest test-problem-two

  (testing "The sum of all even fibonacci numbers below 10 should equal 10"
    (is
     (= 10 (find-sum 10)))))
