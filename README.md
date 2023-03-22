# scala-monorepo
Example of a scala monorepo using bazel


### Setup
1. `brew install bazelisk`.
1. Install [Bazel for IntelliJ](https://plugins.jetbrains.com/plugin/8609-bazel-for-intellij).
1. Start IntelliJ > Import Bazel Project > Select the root of this project.
1. View the Bazel tab on the bottom toolbar and assure that sync completes successfully.

### Tests
`bazel test //...`