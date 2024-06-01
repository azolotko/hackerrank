ThisBuild / scalaVersion := "2.13.14"

lazy val `sock-merchant` =
  project.in(file("challenges/sock-merchant"))

lazy val `jumping-on-the-clouds` =
  project.in(file("challenges/jumping-on-the-clouds"))

lazy val `repeated-string` =
  project.in(file("challenges/repeated-string"))

lazy val `counting-valleys` =
  project.in(file("challenges/counting-valleys"))

lazy val `hourglass-sum` =
  project.in(file("challenges/hourglass-sum"))

lazy val `dynamic-array` =
  project.in(file("challenges/dynamic-array"))

lazy val `flipping-bits` =
  project.in(file("challenges/flipping-bits"))

lazy val `primality` =
  project.in(file("challenges/primality"))

lazy val `friend-circle-queries` =
  project.in(file("challenges/friend-circle-queries"))

lazy val `ctci-ransom-note` =
  project.in(file("challenges/ctci-ransom-note"))

lazy val `two-strings` =
  project.in(file("challenges/two-strings"))

lazy val `maximum-xor` =
  project.in(file("challenges/maximum-xor"))

lazy val `alternating-characters` =
  project.in(file("challenges/alternating-characters"))

lazy val `sherlock-and-valid-string` =
  project.in(file("challenges/sherlock-and-valid-string"))

lazy val `special-palindrome-again` =
  project.in(file("challenges/special-palindrome-again"))

lazy val `one-week-preparation-kit-plus-minus` =
  project.in(file("challenges/one-week-preparation-kit-plus-minus"))

lazy val `one-week-preparation-kit-mini-max-sum` =
  project.in(file("challenges/one-week-preparation-kit-mini-max-sum"))

lazy val `one-week-preparation-kit-time-conversion` =
  project.in(file("challenges/one-week-preparation-kit-time-conversion"))

lazy val `largest-rectangle` =
  project.in(file("challenges/largest-rectangle"))

ThisBuild / libraryDependencies ++=
  Seq(
    "weaver-cats",
    "weaver-scalacheck"
  ).map("com.disneystreaming" %% _ % "0.8.4" % Test)

ThisBuild / testFrameworks +=
  new TestFramework("weaver.framework.CatsEffect")

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
      `primality`,
      `friend-circle-queries`,
      `ctci-ransom-note`,
      `two-strings`,
      `maximum-xor`,
      `alternating-characters`,
      `sherlock-and-valid-string`,
      `special-palindrome-again`,
      `one-week-preparation-kit-plus-minus`,
      `one-week-preparation-kit-mini-max-sum`,
      `one-week-preparation-kit-time-conversion`,
      `largest-rectangle`
    )
