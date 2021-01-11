
load("@dagger//:workspace_defs.bzl", "dagger_rules")
load("@rules_java//java:defs.bzl", "java_binary", "java_library")

dagger_rules()

# package(default_visibility = ["//:src"])

java_library(
    name = "atm",
    srcs = glob(["src/atm/*.java"]),
    deps = [
        "//:dagger",
    ],
)

java_binary(
    name = "CommandLineAtm",
    # bc we have a BUILD file in the root, so we don't need to do src/atm, just atm
    main_class = "atm.CommandLineAtm",
    runtime_deps = [":atm"],
)
