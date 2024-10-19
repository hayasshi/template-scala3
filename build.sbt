val scala3Version = "3.6.1"

lazy val root = project.in(file("."))
  .settings(
    name := "template-scala3",
    scalaVersion := scala3Version,
  )
  .aggregate(core)

lazy val core = project.in(file("core"))
  .settings(
    name := "template-scala3-core",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "1.0.1" % Test
  )
