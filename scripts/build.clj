(require '[cljs.build.api :as b])

(println "Building ...")

(b/build "src"
  {:main 'cljs-1298.core
   :output-to "resources/cljs_1298.js"
   :output-dir "resources"
   :asset-path "resources"
   :verbose true})
