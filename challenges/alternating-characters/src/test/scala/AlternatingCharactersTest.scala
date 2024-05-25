import weaver.scalacheck._

object AlternatingCharactersTest extends weaver.FunSuite with Checkers {
  import Solution._

  test("Empty input") {
    expect(alternatingCharacters("") == 0)
  }

  test("Sample Input 0") {
    expect(alternatingCharacters("AAAA") == 3)
  }

  test("Sample Input 1") {
    expect(alternatingCharacters("BBBBB") == 4)
  }

  test("Sample Input 2") {
    expect(alternatingCharacters("ABABABAB") == 0)
  }

  test("Sample Input 3") {
    expect(alternatingCharacters("BABABA") == 0)
  }

  test("Sample Input 4") {
    expect(alternatingCharacters("AAABBB") == 4)
  }
}
