(ns testing.core-test
  (:require                                                 ;[clojure.test :refer :all] ;if using expectations by itself can't use clojure.test natively unless you use the specific library
            [testing.core :refer :all]
            [expectations :refer :all]))

(comment
  "To run these tests, uncomment the clojure.test require and these tests, comment expectations and its tests, and run 'lein test'"
  (deftest a-test
           (testing "FIXME, I fail."
                    (is (= 0 1))))

  (deftest b-test
           (testing "will this actually call something?"
                    (is (= "fish" (foo2 1 1)))))
  )

; to run these tests do "lein expectations"
(expect 4 (foo2 2 2))

(expect "fish" (foo2 2 2))

(expect true (foo2 2 2))

(expect 6 (foo2 2 2))