load("@rules_clojure//:rules.bzl", "clojure_library")

clojure_library(
    name = "lib",
    srcs = glob(["src/**/*.clj"]),
    deps = [],
    resource_strip_prefix = "bazel-example",
    aot = ["jungwoo.bazel-example.core"])
