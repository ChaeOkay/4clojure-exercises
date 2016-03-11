;; https://www.4clojure.com/problem/21

(fn nth_element [list, index]
  (first (drop index list)))
