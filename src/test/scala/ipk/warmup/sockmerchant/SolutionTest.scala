package ipk.warmup.sockmerchant

import munit.FunSuite

class SolutionTest extends FunSuite {
  test("sockMerchant") {
    assertEquals(
      Solution.sockMerchant(9, Array(10, 20, 20, 10, 10, 30, 50, 10, 20)),
      3
    )
  }
}
