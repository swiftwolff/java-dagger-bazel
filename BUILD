
load("@dagger//:workspace_defs.bzl", "dagger_rules")
load("@rules_java//java:defs.bzl", "java_binary", "java_library")

dagger_rules()

# package(default_visibility = ["//:src"])

java_library(
    name = "atm",
    srcs = glob(["src/*.java"]),
    deps = [
        "//:dagger",
    ],
)

java_binary(
    name = "CommandLineAtm",
    main_class = "CommandLineAtm",
    runtime_deps = [":atm"],
)
