load("@rules_clojure//:rules.bzl", "clojure_library")

clojure_library(
    name = "libsimpleexample",
    srcs = ["example.clj"],
    resource_strip_prefix = "simple-example",
    aot = ["example"],
    deps = [
         "@maven//:org_clojure_clojure",
         "@maven//:org_clojure_spec_alpha",
         "@maven//:org_clojure_core_specs_alpha",
    ])
