(ns exercise4)

(defn summary
  "Calculates the sum of all the elements on a list."
  [elements]
  (reduce + 0 elements))
