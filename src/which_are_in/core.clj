(ns which-are-in.core)

(defn in-array [array1 array2]
  (->> array1
       (filter (fn [s] (some #(clojure.string/includes? % s) array2)))
       (remove nil?)
       distinct
       sort))
