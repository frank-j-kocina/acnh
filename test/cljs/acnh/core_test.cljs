(ns acnh.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [acnh.core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 2))))
