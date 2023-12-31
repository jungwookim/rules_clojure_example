(ns jungwoo.bazel-example.env
  (:require
    [clojure.tools.logging :as log]
    [jungwoo.bazel-example.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init       (fn []
                 (log/info "\n-=[bazel-example starting using the development or test profile]=-"))
   :start      (fn []
                 (log/info "\n-=[bazel-example started successfully using the development or test profile]=-"))
   :stop       (fn []
                 (log/info "\n-=[bazel-example has shut down successfully]=-"))
   :middleware wrap-dev
   :opts       {:profile       :dev
                :persist-data? true}})
