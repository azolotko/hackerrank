import weaver.scalacheck._

object PlusMinusTest extends weaver.FunSuite with Checkers {
  import Solution._

  test("Empty input") {
    expect(plusMinus0(Array.empty) == (0.0, 0.0, 0.0))
  }

  test("Sample Input") {
    expect(plusMinus0(Array(-4, 3, -9, 0, 4, 1)) == (0.5, 0.3333333333333333, 0.16666666666666666))
  }
}
