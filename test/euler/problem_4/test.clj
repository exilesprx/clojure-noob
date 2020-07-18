(ns euler.problem-4.test
  (:require [clojure.test :refer :all]
            [euler.problem-4.main :refer :all]))

(deftest problem-four-test
  (testing "Determines a number is a palindrome"
    (is (is-palindrome? 1001)))
  (testing "Determines a number is not a palindrome"
    (is (false? (is-palindrome? 123))))

  (testing "Finds the largest palindrome from a product of two 3-digit numbers."
    (is (= 906609 (find-largest-palindrome 3)))))
