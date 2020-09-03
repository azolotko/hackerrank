name := "hackerrank"

version := "0.1.0"

scalaVersion := "0.27.0-RC1"

libraryDependencies ++= Seq(
  "org.scalameta" %% "munit" % "0.7.12" % Test
)

testFrameworks += new TestFramework("munit.Framework")
