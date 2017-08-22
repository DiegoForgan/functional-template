(ns exercise2)

(defn only-greater-than-five
  "Filters the elements on a list which are greater than five."
  [elements]
  (filter (fn [elements] (< 5 elements)) elements))
