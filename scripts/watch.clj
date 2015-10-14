(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'cljs-1298.core
   :output-to "out/cljs_1298.js"
   :output-dir "out"})
