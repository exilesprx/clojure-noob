(ns euler.problem-9.test
  (:require [clojure.test :refer :all]
            [euler.problem-9.main :refer :all]))

(deftest test-problem-nine
  (testing "it finds the product for a given pythagorean triplet"
    (is (= 1 (finds-product-of-pythagorean-triplet 0)))))
