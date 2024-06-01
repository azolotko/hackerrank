import weaver.scalacheck._

object LargestRectangleTest extends weaver.FunSuite with Checkers {
  import Solution._

  test("Empty input") {
    expect(largestRectangle(Array.empty) == 0)
  }

  test("Sample Input") {
    expect(largestRectangle(Array(1, 2, 3, 4, 5)) == 9)
  }
}
