(ns which-are-in.core-test
  (:require [clojure.test :refer :all]
            [which-are-in.core :refer :all]))

(deftest a-test1
  (testing "Test 1"
    (def ur ["olp" "love" "string"])
    (def vr ["ulove" "alove" "holp" "sholp","vfmstring"])
    (def rr ["love" "olp" "string"])
    (is (= (in-array ur vr) rr))))