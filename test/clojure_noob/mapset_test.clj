(ns clojure-noob.mapset-test
  (:require [clojure.test :refer :all]
            [clojure-noob.core :refer :all]
            [clojure-noob.mapset :refer :all]))

(deftest mapset-test
  (testing "Increments each value of a vector"
    (is
      (=
        (set [2 3 4])
        (mapset inc [1 2 3])
      )
    )
  )
  (testing "Decrements each value of a vector"
    (is
      (=
        (set [1 2 0])
        (mapset dec [1 2 3])
      )
    )
  )
)
