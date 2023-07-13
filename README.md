# rules_clojure EXAMPLE

This repository provides an example of how to use [rules_clojure](https://github.com/griffinbank/rules_clojure) with complex project structures. It demonstrates the following features:
- Mono repo
- Multiple Clojure projects
- Separate directories for source code (`src`), resources, and dependencies (`deps`)

## Clojure dependencies
To manage Clojure dependencies, you have two options:
1. Use [gen_srcs](https://github.com/griffinbank/rules_clojure#build-generation-optional) to generate BUILD files automatically.
2. Utilize [rules_jvm_external](https://github.com/bazelbuild/rules_jvm_external) for pure Bazel compatibility.

### How to use rules_jvm_external
To use rules_jvm_external, configure your BUILD file accordingly. You will also need to include JVM and Maven related dependencies in your WORKSPACE file. Refer to [this example](https://github.com/jungwookim/rules_clojure_example/blob/main/WORKSPACE#L5-L120) for guidance.

### How to use gen_srcs
In this repository, the `gen-example` project includes a generated BUILD file using gen_srcs.

## Directory Structure
- `gen-example`: An example project demonstrating the usage of gen_srcs with a generated BUILD file.
- `example`: A project showcasing both gen_srcs and rules_jvm_external.
- `simple-example`: A project illustrating the usage of rules_jvm_external.
