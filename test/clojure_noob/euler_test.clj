(ns clojure-noob.euler-test
  (:require [clojure.test :refer :all]
            [clojure-noob.core :refer :all]
            [clojure-noob.euler :refer :all]))

(deftest euler
  (testing
    (is
      (= 23 (problem-one 10))
      )
    )
  )
