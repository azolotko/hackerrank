import weaver.scalacheck._

object MiniMaxSumTest extends weaver.FunSuite with Checkers {
  import Solution._

  test("Empty input") {
    expect(miniMaxSum0(Array.empty) == (0L, 0L))
  }

  test("Example") {
    expect(miniMaxSum0(Array(1, 3, 5, 7, 9)) == (16L, 24L))
  }

  test("Sample Input") {
    expect(miniMaxSum0(Array(1, 2, 3, 4, 5)) == (10L, 14L))
  }

  test("Test case 1") {
    expect(miniMaxSum0(Array(256741038, 623958417, 467905213, 714532089, 938071625)) == (2063136757L, 2744467344L))
  }

}
