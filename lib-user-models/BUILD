load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_test")

dependencies = [
    "@maven//:org_typelevel_cats_core_2_13",
    "@maven//:com_chuusai_shapeless_2_13",
    "@maven//:io_circe_circe_core_2_13",
    "@maven//:io_circe_circe_generic_2_13",
    "@maven//:io_circe_circe_parser_2_13",
]

scala_library(
    name = "lib",
    srcs = glob([
        "src/main/scala/**/*.scala",
    ]),
    resources = glob([
        "src/main/resources/**/*",
    ]),
    scalacopts = [
        #"-target:jvm-1.9",
        #"-encoding",
        #"UTF-8",
        #"-Xfuture",
        #"-Xlint",
        #"-Xlint:unsound-match",
        #"-Xmacro-settings:materialize-derivations",
        #"-Ypartial-unification",
        #"-Ywarn-unused:imports",
        #"-Ywarn-value-discard",
        #"-Ywarn-dead-code",
        #"-Ywarn-numeric-widen",
        #"-language:existentials",
        #"-language:experimental.macros",
        #"-language:higherKinds",
        #"-deprecation",
        #"-feature",
        #"-unchecked",
    ],
    deps = dependencies,
)

scala_test(
    name = "tests",
    size = "small",
    srcs = glob([
        "src/test/**/*Spec.scala",
    ]),
    resources = glob([
        "src/test/resources/**/*",
    ]),
    deps = [
        ":lib",
    ] + dependencies,
)
