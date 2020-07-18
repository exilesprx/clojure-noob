(ns euler.problem-5.test
  (:require [clojure.test :refer :all]
            [euler.problem-5.main :refer :all]))

(deftest problem-five

  (testing "The smallest number divisible by 1-10 is 2520"
    (is (= 2520 (find-smallest-number 10)))))
