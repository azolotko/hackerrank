import weaver.scalacheck._

object SpecialPalindromeAgainTest extends weaver.FunSuite with Checkers {
  import Solution._

  test("Empty input") {
    expect(substrCount("") == 0)
  }

  test("Definition") {
    expect(substrCount("mnonopoo") == 12)
  }


  test("Sample Input 0") {
    expect(substrCount("asasd") == 7)
  }

  test("Sample Input 1") {
    expect(substrCount("abcbaba") == 10)
  }

  test("Sample Input 2") {
    expect(substrCount("aaaa") == 10)
  }
}
