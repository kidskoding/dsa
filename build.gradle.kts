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

    // main = module impl + problemset, excluding the tests/ subtree.
    val mainSet = sourceSets.create("main_$id") {
        java.setSrcDirs(listOf(dir))
        java.exclude("tests/**")
    }

    // test = everything under tests/, compiled against this module's main output.
    val testSet = sourceSets.create("test_$id") {
        java.setSrcDirs(listOf(File(dir, "tests")))
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

// Lint: runs editorconfig-checker (same as the CI `lint` job) via lint.sh,
// which fetches the checker binary into build/tools/ on first use.
//   ./gradlew lint
tasks.register<Exec>("lint") {
    group = "verification"
    description = "Run editorconfig-checker over the repo (CI lint)."
    workingDir = rootDir
    commandLine("bash", "lint.sh")
}
