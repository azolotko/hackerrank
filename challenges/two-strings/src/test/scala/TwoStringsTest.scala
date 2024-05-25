import weaver.scalacheck._

object TwoStringsTest extends weaver.FunSuite with Checkers {
  import Solution._

  test("Empty input") {
    expect(twoStrings("", "") == "NO")
  }

  test("Sample Input 0") {
    expect(twoStrings("hello", "world") == "YES").and(
      expect(twoStrings("hi", "world") == "NO")
    )
  }
}
