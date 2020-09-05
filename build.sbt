name := "hackerrank"

version := "0.1.0"

scalaVersion := "2.13.3"

enablePlugins(JmhPlugin)

libraryDependencies ++= Seq(
  "org.scalameta" %% "munit" % "0.7.12" % Test
)

testFrameworks += new TestFramework("munit.Framework")
