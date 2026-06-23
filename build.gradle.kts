// DSA Mastery workbook test runner.
//
// No build tool was used originally — just javac + the vendored JUnit console.
// The catch: every module's source lives in the default package, so class names
// collide across modules (many different `Problem01` classes, etc.). A single
// classpath can't hold them all. So we give EACH module folder its own isolated
// source set + test task, discovered automatically from `src/`.
//
//   ./gradlew test              # compile + run every module's JUnit 5 tests
//   ./gradlew test_06-trees     # one module (task name == folder name)
//   ./gradlew tasks --group verification   # list per-module test tasks
//
// Skeletons throw UnsupportedOperationException, so tests FAIL by design until
// you implement them. That's the workbook working as intended — `ignoreFailures`
// lets every module run and report rather than aborting at the first red module.

plugins {
    java
}

repositories {
    mavenCentral()
}

val junitVersion = "5.10.2"

val moduleDirs = file("src").listFiles()
    .orEmpty()
    .filter { it.isDirectory && it.walkTopDown().any { f -> f.extension == "java" } }
    .sortedBy { it.name }

val moduleTestTasks = moduleDirs.map { dir ->
    val id = dir.name // e.g. "06-trees"

    // main = module impl + problemset + extra-practice stubs, excluding every
    // tests/ subtree (the top-level one and any under extra-practice/).
    val mainSet = sourceSets.create("main_$id") {
        java.setSrcDirs(listOf(dir))
        java.exclude("tests/**", "extra-practice/tests/**")
    }

    // test = everything under tests/ (plus generated extra-practice/tests/),
    // compiled against this module's main output. Missing dirs are ignored.
    val testSet = sourceSets.create("test_$id") {
        java.setSrcDirs(listOf(File(dir, "tests"), File(dir, "extra-practice/tests")))
        compileClasspath += mainSet.output
        runtimeClasspath += mainSet.output
    }

    dependencies.add(testSet.implementationConfigurationName, "org.junit.jupiter:junit-jupiter:$junitVersion")
    // Gradle 9 no longer puts the launcher on the test runtime classpath automatically.
    dependencies.add(testSet.runtimeOnlyConfigurationName, "org.junit.platform:junit-platform-launcher")

    tasks.register<Test>("test_$id") {
        description = "Run JUnit 5 tests for the $id module."
        group = "verification"
        testClassesDirs = testSet.output.classesDirs
        classpath = testSet.runtimeClasspath
        useJUnitPlatform()
        ignoreFailures = true
        testLogging {
            events("passed", "failed", "skipped")
        }
    }
}

// `./gradlew test` aggregates every module (the java plugin's default `test`
// task is bound to an empty source set, so we just hang the modules off it).
tasks.named("test") {
    dependsOn(moduleTestTasks)
}

// Lint: runs editorconfig-checker (same as the CI `lint` job). The checker
// binary is fetched into build/tools/ on first use.
//   ./gradlew lint
tasks.register<Exec>("lint") {
    group = "verification"
    description = "Run editorconfig-checker over the repo (CI lint)."
    workingDir = rootDir
    commandLine(
        "bash", "-c",
        """
        set -e
        VER=3.0.3
        OS=${'$'}(uname -s | tr '[:upper:]' '[:lower:]')
        ARCH=${'$'}(uname -m); [ "${'$'}ARCH" = "x86_64" ] && ARCH=amd64; [ "${'$'}ARCH" = "aarch64" ] && ARCH=arm64
        BIN=build/tools/ec
        if [ ! -x "${'$'}BIN" ]; then
            mkdir -p build/tools
            curl -fsSL "https://github.com/editorconfig-checker/editorconfig-checker/releases/download/v${'$'}{VER}/ec-${'$'}{OS}-${'$'}{ARCH}.tar.gz" | tar -xz -C build/tools
            mv "build/tools/bin/ec-${'$'}{OS}-${'$'}{ARCH}" "${'$'}BIN"
        fi
        exec "${'$'}BIN" --config .editorconfig-checker.json
        """.trimIndent(),
    )
}
