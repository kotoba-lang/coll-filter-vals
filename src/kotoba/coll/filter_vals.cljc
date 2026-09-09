(ns kotoba.coll.filter-vals
  "filter-vals -- one definition, addressed on its own.

  Split out of kotoba.lang.text on 2026-09-09. The unit here is the
  DEFINITION, not the library: this repo holds filter-vals and names, in its
  deps.edn, exactly the definitions filter-vals reaches. Nothing else."
  )

(defn filter-vals
  "Return a map containing only the entries of `m` whose value satisfies
  `pred`."
  [pred m]
  (reduce-kv (fn [out k v]
               (if (pred v) (assoc out k v) out))
             {} m))
