load("@rules_clojure//:rules.bzl", "clojure_library")

clojure_library(
    name = "libexample",
    srcs = glob(["src/**/*.clj"]),
    resource_strip_prefix = "example",
    aot = ["jungwoo.bazel-example.core"],
    deps = [
         "@maven//:org_clojure_clojure",
         "@maven//:org_clojure_spec_alpha",
         "@maven//:org_clojure_core_specs_alpha",
         "@maven//:metosin_reitit",
         "@maven//:metosin_ring_http_response",
         "@maven//:ring_ring_core",
         "@maven//:ring_ring_defaults",
         "@maven//:ch_qos_logback_logback_classic",
         "@maven//:luminus_transit_luminus_transit",
         "@maven//:metosin_muuntaja",
         "@maven//:io_github_kit_clj_kit_core",
         "@maven//:io_github_kit_clj_kit_undertow",
    ],
    )
