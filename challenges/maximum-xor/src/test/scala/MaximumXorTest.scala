import weaver.scalacheck._

object MaximumXorTest extends weaver.FunSuite with Checkers {
  import Solution._

  test("Empty input") {
    expect(maxXor(Array.empty, Array.empty).sameElements(Array.empty[Int]))
  }

  test("Sample Input 0") {
    expect(maxXor(Array(0, 1, 2), Array(3, 7, 2)).toSeq == Seq(3, 7, 3))
  }

  test("Sample Input 1") {
    expect(maxXor(Array(5, 1, 7, 4, 3), Array(2, 0)).toSeq == Seq(7, 7))
  }

  test("Sample Input 2") {
    expect(maxXor(Array(1, 3, 5, 7), Array(17, 6)).toSeq == Seq(22, 7))
  }
}
