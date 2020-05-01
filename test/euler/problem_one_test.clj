(ns euler.problem-one-test
  (:require [clojure.test :refer :all]
            [euler.problem-one :refer :all]))

(deftest test-problem-one
  (testing "The sum of all multiple of 3 and 5 below 10 should equal 23"
    (is
      (= 23 (find-sum 10))
      )
    )
  )
