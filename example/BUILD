load("@rules_clojure//:rules.bzl", "clojure_library")

clojure_library(
    name = "lib",
    srcs = glob(["src/**/*.clj"]),
    resource_strip_prefix = "bazel-example",
    aot = ["jungwoo.bazel-example.core"],
    deps = [
         "@maven//:org_clojure_clojure",
         "@maven//:org_clojure_spec_alpha",
         "@maven//:org_clojure_core_specs_alpha",
        #  "@maven//:metosin_reitit",
        #  "@maven//:metosin_ring-http-response",
        #  "@maven//:ring_ring-core",
        #  "@maven//:ring_ring-defaults",
        #  "@maven//:ch_qos_logback_logback-classic",
        #  "@maven//:luminus-transit_luminus-transit",
        #  "@maven//:metosin_muuntaja",
        #  "@maven//:io_github_kit-clj_kit-core",
        #  "@maven//:io_github_kit-clj_kit-undertow",
    ],
    )
