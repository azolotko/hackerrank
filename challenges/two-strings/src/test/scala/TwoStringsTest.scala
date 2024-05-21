import weaver.scalacheck._

object TwoStringsTest extends weaver.FunSuite with Checkers {
  import SolutionImpl._

  test("Empty input") {
    expect(twoStrings("", "") == "NO")
  }

  test("Sample Input 0") {
    expect(twoStrings("hello", "world") == "YES").and(
      expect(twoStrings("hi", "world") == "NO")
    )
  }
}
