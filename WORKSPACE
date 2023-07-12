workspace(name = "rules_clojure_example")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# rules_jvm_external section ------------------------------------

RULES_JVM_EXTERNAL_TAG = "4.5"
RULES_JVM_EXTERNAL_SHA = "b17d7388feb9bfa7f2fa09031b32707df529f26c91ab9e5d909eb1676badd9a6"

http_archive(
    name = "rules_jvm_external",
    sha256 = RULES_JVM_EXTERNAL_SHA,
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")
rules_jvm_external_deps()

load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")
rules_jvm_external_setup()

load("@rules_jvm_external//:defs.bzl", "maven_install")
load("@rules_jvm_external//:specs.bzl", "maven")

maven_install(
    artifacts =
        [
            maven.artifact(
                group = "metosin",
                artifact = "reitit",
                version = "0.6.0"
            ),
            maven.artifact(
                group = "metosin",
                artifact = "ring-http-response",
                version = "0.9.3"
            ),
            maven.artifact(
                group = "ring",
                artifact = "ring-core",
                version = "1.10.0"
            ),
            maven.artifact(
                group = "ring",
                artifact = "ring-defaults",
                version = "0.3.3"
            ),
            maven.artifact(
                group = "ch.qos.logback",
                artifact = "logback-classic",
                version = "1.4.4"
            ),
            maven.artifact(
                group = "luminus-transit",
                artifact = "luminus-transit",
                version = "0.1.5",
                exclusions = [
                    "com.cognitect:transit-clj",
                ]
            ),
            maven.artifact(
                group = "metosin",
                artifact = "muuntaja",
                version = "0.6.8"
            ),
            maven.artifact(
                group = "io.github.kit-clj",
                artifact = "kit-core",
                version = "1.0.3"
            ),
            maven.artifact(
                group = "io.github.kit-clj",
                artifact = "kit-undertow",
                version = "1.0.5"
            ),
            maven.artifact(
                group = "org.clojure",
                artifact = "clojure",
                version = "1.11.1",
                exclusions = [
                    "org.clojure:spec.alpha",
                    "org.clojure:core.specs.alpha"
                ]
            ),
            maven.artifact(
                group = "org.clojure",
                artifact = "spec.alpha",
                version = "0.3.218",
                exclusions = ["org.clojure:clojure"]
                ),
            maven.artifact(
                group = "org.clojure",
                artifact = "core.specs.alpha",
                version = "0.2.62",
                exclusions = [
                    "org.clojure:clojure",
                    "org.clojure:spec.alpha"
                ]),
            "ant:ant-junit:1.6.5",
            "com.google.guava:guava:jar:30.1.1-jre",
            "com.google.truth:truth:1.1.3",
            "junit:junit:4.12",
            "org.apache.ant:ant:1.10.10",
        ],
    fail_on_missing_checksum = False,
    fetch_sources = True,
    repositories = [
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
        "https://clojars.org/repo/"
    ],
    version_conflict_policy = "pinned",
)

load("@maven//:defs.bzl", "pinned_maven_install")

pinned_maven_install()

# rules_jvm_external section ------------------------------------


# rules_clojure section ------------------------------------

RULES_CLOJURE_SHA = "bad7ead30e3426425d4ae44d974a2bfa868d61e8"
http_archive(name = "rules_clojure",
             strip_prefix = "rules_clojure-%s" % RULES_CLOJURE_SHA,
             url = "https://github.com/griffinbank/rules_clojure/archive/%s.zip" % RULES_CLOJURE_SHA)

load("@rules_clojure//:repositories.bzl", "rules_clojure_deps")
rules_clojure_deps()

load("@rules_clojure//:setup.bzl", "rules_clojure_setup")
rules_clojure_setup()

# rules_clojure section ------------------------------------
