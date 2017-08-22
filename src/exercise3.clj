(ns exercise3)

(defn fibonacci
  "Calculates the nth number in the Fibonacci series."
  [n]
  (if
    (<= n 1)
    (if (= n 0) 0 1)
    (+ (fibonacci(- n 1)) (fibonacci (- n 2)))
  ))
