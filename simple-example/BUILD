load("@rules_clojure//:rules.bzl", "clojure_library")

clojure_library(
    name = "lib",
    srcs = ["example.clj"],
    resource_strip_prefix = "bazel-simple-example",
    aot = ["example"],
    deps = [
         "@maven//:org_clojure_clojure",
         "@maven//:org_clojure_spec_alpha",
         "@maven//:org_clojure_core_specs_alpha",
    ])
