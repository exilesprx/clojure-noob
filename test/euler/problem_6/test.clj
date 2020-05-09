(ns euler.problem-6.test
  (:require [clojure.test :refer :all]
            [euler.problem-6.main :refer :all]))

(deftest problem-six

  (testing "The difference between the sum of the squares of the first 10 natural numbers and the square of the sum is 2640"
    (is (= 2640 (find-sum-square-difference)))
    )
)
