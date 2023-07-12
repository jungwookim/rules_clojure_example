(ns jungwoo.bazel-example.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init       (fn []
                 (log/info "\n-=[bazel-example starting]=-"))
   :start      (fn []
                 (log/info "\n-=[bazel-example started successfully]=-"))
   :stop       (fn []
                 (log/info "\n-=[bazel-example has shut down successfully]=-"))
   :middleware (fn [handler _] handler)
   :opts       {:profile :prod}})
