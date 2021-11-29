ThisBuild / scalaVersion := "2.13.7"

lazy val `sock-merchant` =
  project
    .in(file("challenges/sock-merchant"))

lazy val `jumping-on-the-clouds` =
  project
    .in(file("challenges/jumping-on-the-clouds"))

lazy val `repeated-string` =
  project
    .in(file("challenges/repeated-string"))

lazy val `counting-valleys` =
  project
    .in(file("challenges/counting-valleys"))

lazy val `hourglass-sum` =
  project
    .in(file("challenges/hourglass-sum"))

lazy val `dynamic-array` =
  project
    .in(file("challenges/dynamic-array"))

lazy val `flipping-bits` =
  project
    .in(file("challenges/flipping-bits"))

lazy val `primality` =
  project
    .in(file("challenges/primality"))

lazy val root =
  project
    .in(file("."))
    .settings(
      name := "hackerrank"
    )
    .aggregate(
      `sock-merchant`,
      `jumping-on-the-clouds`,
      `repeated-string`,
      `counting-valleys`,
      `hourglass-sum`,
      `dynamic-array`,
      `flipping-bits`,
      `primality`
    )
