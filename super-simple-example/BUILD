load("@rules_clojure//:rules.bzl", "clojure_library")

clojure_library(
    name = "example",
    srcs = ["example.clj"],
    aot = ["example"],
    # resource_strip_prefix = "bazel-super-simple-example",
    deps = [
         "@maven//:org_clojure_clojure",
         "@maven//:org_clojure_spec_alpha",
         "@maven//:org_clojure_core_specs_alpha",
    ]
)
